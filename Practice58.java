import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice58 extends ConsoleProgram{
	public void run(){
		int [][] matrix = {{1, 3}, {2, 4}};
		int [][] ma2 = new int[2][2];
		println(isMagic1(matrix));
	}

	private boolean isMagic1(int[][] matrix) {
		if(matrix.length != matrix[0].length){
			return false;
		}
		ArrayList<Integer> arr = getArrayList(matrix.length);
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(arr.contains(matrix[i][j])){
					arr.remove((Integer)matrix[i][j]);
				}
			}
		}
		return arr.isEmpty();
	}

	private ArrayList<Integer> getArrayList(int length) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 1; i <= length*length; i++){
			arr.add(i);
		}
		return arr;
	}
	public void run1(){
		int[][] m = {{1, 3}, {2, 4}};
		println(isMagic1(m));
	}
	
	private boolean isMagic(int[][] m){
		int n = m.length;
		for(int i = 1; i <= n; i++){
			if(!containsMatrix(m, i)){
				return false;
			}
		}
		return true;
	}

	private boolean containsMatrix(int[][] m, int num) {
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[0].length; j++){
				if(m[i][j] == num){
					return true;
				}
			}
		}
		return false;
	}
}
