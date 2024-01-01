import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Practice59 extends ConsoleProgram {
	RandomGenerator rgen = new RandomGenerator();
	public void run() {
		int[][] mat = new int[4][4];
		fillMat(mat);
		printMatrix(mat);
		println();
		int full = 0;
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				int right = countRight(mat, i, j);
				int down = countDown(mat, i, j);
				int max = checkMatrix(mat, i, j, i + down - 1, j + right - 1);
				if(max > full){
					full = max;
				}
			}
		}
		println("max is: " + fullMax);
	}
	private int checkMatrix(int[][]mat, int i, int j, int k, int l) {
		int max = -1;
		for(int r = i; r <= k; r++){
			for(int c = j; c <= l; c++){
				if(isFilled(mat, i, j, r, c)){
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
	
	private int countDown(int[][] mat, int i, int j) {
		int count = 0;
		for(int k = i; k < mat.length; k++){
			if(mat[i][k] == 1){
				count++;
			}else{
				break;
			}
		}
		return count;
	}
	private int countRight(int[][] mat, int i, int j) {
		int count = 0;
		for(int k = j; k < mat[i].length; k++){
			if(mat[i][k] == 1){
				count++;
			}else{
				break;
			}
		}
		return count;
	}
	private void fillMat(int[][] mat) {
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat.length; j++){
				mat[i][j] = rgen.nextInt(0, 1);
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
