import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class MidTerm1624 extends ConsoleProgram {
	
	private char wrong;
	
	public void run() {
		String text = readLine();
		println(unEvilText(text));
	}

	private String unEvilText(String text) {
		StringTokenizer tok = new StringTokenizer(text, " ");
		String str = "";

		while (tok.hasMoreTokens()) {
			String s = tok.nextToken();
			String cor = s;
			
			for (int i = 1; i < cor.length(); i++) {
				char a = cor.charAt(i);
				char b = cor.charAt(i - 1);
				if (a == b) {
					wrong = a;
				}
			}
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if (c != wrong) {
					cor = "";
					cor += c;
				}
			}
			
			str += cor + " ";
		}
		return str;
	}
}