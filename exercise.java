import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class exercise extends ConsoleProgram {	
	public void run() {
		String str = "dessert";
		for(int i = 0; i <= str.length(); i++){
			str = str + str.charAt(i);
		}
		println(str);
	}
}
