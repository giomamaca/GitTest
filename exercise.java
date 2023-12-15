import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.*;
import java.awt.*;

public class exercise extends ConsoleProgram {	
	public void run() {
		int[] num = new int[5];
		for(int i = 0; i < num.length; i++){
			num [i] = readInt();
		}
		println(num.toString());
	}
}
