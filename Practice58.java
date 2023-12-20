import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice58 extends ConsoleProgram{
	public void run1(){
		int[][] m = {{1, 3}, {2, 4}};
		println(isMagic(m));
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
