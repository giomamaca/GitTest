import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice59 extends ConsoleProgram {
	RandomGenerator rgen = new RandomGenerator();
	public void run() {
		int[][] m = new int[4][4];
		fillRandomMatrixWithOnesAndZeroes(m);
		printMatrix(m);
		println();
		int fullMax = 0;
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				int right = countRight(m, i, j);
				int down = countDown(m, i, j);
				int max = checkMatrix(m, i, j, i + down - 1, j + right - 1);
				if(max > fullMax){
					fullMax = max;
				}
			}
		}
		println("max is: " + fullMax);
	}

	private int checkMatrix(int[][]m, int i, int j, int k, int l) {
		int max = -1;
		for(int r = i; r <= k; r++){
			for(int c = j; c <= l; c++){
				if(isFilled(m, i, j, r, c)){
					int size = (r - i + 1) * (c - j + 1);
					if(size > max){
						max = size;
					}
				}
			}
		}
		return max;
	}

	private boolean isFilled(int[][] m, int i, int j, int r, int c) {
		for(int a = i; a <= r; a++){
			for(int b = j; b <= c; b++){
				if(m[a][b] != 1){
					return false;
				}
			}
		}
		return true;
	}

	private int countDown(int[][] m, int i, int j) {
		int count = 0;
		for(int k = i; k < m.length; k++){
			if(m[k][j] == 1){
				count++;
			}else{
				break;
			}
			
		}
		return count;
	}

	private int countRight(int[][] m, int i, int j) {
		int count = 0;
		for(int k = j; k < m[i].length; k++){
			if(m[i][k] == 1){
				count++;
			}else{
				break;
			}
			
		}
		return count;
	}

	private void fillRandomMatrixWithOnesAndZeroes(int[][] m) {
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				m[i][j] = rgen.nextInt(0, 1);
			}
		}
	}
	

	
	private void printMatrix(int[][] m){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				print(m[i][j] + " ");
			}
			println();
		}
	}
}
