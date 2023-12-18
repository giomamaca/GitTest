import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.*;
import java.awt.*;
import java.util.Arrays;

public class exercise extends ConsoleProgram {
	public void run() {
		int[][] num = new int[5][5];
		for(int i = 0; i < num.length; i++){
			for(int j = 0; j < num[i].length; j++){
				num[i][j] = 1;
			}
		}
		println(Arrays.toString(num));
	}
}
