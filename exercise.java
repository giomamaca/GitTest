import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.*;
import java.awt.*;

public class exercise extends ConsoleProgram {	
	public void run() {
		String a = readLine();
		String b = readLine();
		println(isIn(a, b));
		
	}

	private boolean isIn(String a, String b) {
		for(int i = 0; i < b.length(); i++){
			if(a.contains(b.charAt(i) + "")){
				a = cut(a, b.charAt(i));
				b = cut(b, b.charAt(i));
			}else return false;
		}
		return true;
	}

	private String cut(String a, char c) {
		String sub1 = a.substring(0, a.indexOf(c));
		String sub2 = a.substring(a.indexOf(c) + 1);
		
		return sub1 + sub2;
	}
}
