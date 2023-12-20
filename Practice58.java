import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice58 extends ConsoleProgram{
	public void run(){
		int [][] matrix = {{1, 3}, {2, 4}};
		int [][] ma2 = new int[2][2];
		println(isMagic(matrix));
	}

	private boolean isMagic(int[][] matrix) {
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
}
