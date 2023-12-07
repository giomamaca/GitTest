import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Final142 extends ConsoleProgram {
	public void run() {
		String text = readLine();
		println(translateToTitle(text));
	}

	private String translateToTitle(String text) {
		StringTokenizer tk = new StringTokenizer(text);
		String result = "";
		

		while (tk.hasMoreTokens()) {
			String token = tk.nextToken();

			String answer = "";

			for (int i = 0; i < token.length(); i++) {
				String s = "";
				char a = token.charAt(i);
				String st = "";
				if (i == 0) {
					s += a;
					s.toUpperCase();
					System.out.println(s);
				} else {
					st += a;
					st.toLowerCase();
				}
				s += st;
				answer += s;
			}
			result += answer;
		}
		return result;
	}
}
