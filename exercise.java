import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.*;
import java.awt.*;
import java.util.Arrays;

public class exercise extends ConsoleProgram {
	public void run() {
		String s = "aasdadadad";
		metodi(s);
	}

	private void metodi(String s) {
		for(int i = 0; i < s.length() - 1; i++){
			for(int j = i + 1; j < s.length() + 1; j++){
				String sub = s.substring(i, j);
				println(sub);
			}
		}
	}
}
