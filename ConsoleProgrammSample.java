import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import acm.graphics.GOval;
import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	public void run() {
		String s = "adad";
		String sub1 = s.substring(0, s.length() / 2);
		String sub2 = s.substring(s.length() / 2);
		println(sub1);
		println(sub2);
	}
}
