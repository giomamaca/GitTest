import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice51 extends ConsoleProgram {
	public void run() {
		String s = readLine("enter string : ");
		printTokens(s);
	}

	private void printTokens(String s) {
		String a = "";
		String b = "";
		for (int i = 0; i < s.length(); i++) {
			a = s.charAt(i) + a;
			b = s.charAt(i -1) +b;
			if(a == b){
				print(s);				
			}
		}
	}
}
