import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class exercise extends ConsoleProgram {
	public void run() {
		int a = 100;
		for(int i = 0; i < a; i++){
			int c = 100 - i;
			println(c + " " + i);
		}
	}
}
