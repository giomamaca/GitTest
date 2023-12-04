import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class MidTerm1624 extends ConsoleProgram {
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

			int count = 1;
			char wrong = 'a';
			for (int i = 1; i < s.length(); i++) {
				char a = s.charAt(i);
				char b = s.charAt(i - 1);
				String ans = "";
				if (a == b) {
					wrong = a;
					for (int j = 0; j < cor.length(); j++) {
						char c = cor.charAt(j);
						if (c != wrong) {
							cor = "";
							cor += c;
						}
					}
				}
			}
			str += cor + " ";
		}
		return str;
	}

	private boolean bevri(String s) {
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			char b = s.charAt(i - 1);
			if (a == b) {
				return true;
			}
		}
		return false;
	}
}