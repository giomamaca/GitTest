import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice53 extends ConsoleProgram {
	public void run() {
		String text = "";
		try {
			BufferedReader rd = new BufferedReader(new FileReader("Seminari52.java"));
			while (true) {
				String line = rd.readLine();
				if (line == null) {
					break;
				}
				text += line + '\n';
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		println("char count: " + charCount(text));
		println("word count: " + wordCount(text));
		println("sentence count: " + sentenceCount(text));
	}

	private int sentenceCount(String text) {
		int result = 0;
		StringTokenizer tk = new StringTokenizer(text, ".?!");
		while (tk.hasMoreTokens()) {
			tk.nextToken();
			result++;
		}
		return result;
	}

	private int wordCount(String text) {
		int result = 0;
		StringTokenizer tk = new StringTokenizer(text);
		while (tk.hasMoreTokens()) {
			tk.nextToken();
			result++;
		}
		return result;
	}

	private int charCount(String text) {
		int result = 0;
		StringTokenizer tk = new StringTokenizer(text);
		while (tk.hasMoreTokens()) {
			String nextToken = tk.nextToken();
			println(nextToken);
			result += nextToken.length();
		}
		return result;
	}
}
