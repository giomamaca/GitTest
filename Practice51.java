import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice51 extends ConsoleProgram {
	public void run() {
		String s = readLine("enter string : ");
		printTokens(s);
	}

	private void printTokens(String s) {
		char a = 0;
		char b = 0;
		for (int i = 0; i < s.length(); i++) {
			a = s.charAt(i);
			if(b != a){
				b = a;				
			}
		}
		print(s);
	}
}
