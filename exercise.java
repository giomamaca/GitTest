import acm.program.ConsoleProgram;

public class exercise extends ConsoleProgram {
	public void run() {
		String s = readLine("Enter string: ");
		printFrequency(s);
	}

	private void printFrequency(String s) {
		for (int i = 0; i < 26; i++) {
			char next = (char) ('a' + i);
			int countSymbol = countSymbolInString(s, next);
			if (countSymbol > 0)
				println(next + ":" + (double) countSymbol / s.length() * 100 + '%');
		}
	}

	private int countSymbolInString(String s, char ch) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			int current = s.charAt(i);
			if (current == ch) {
				count++;
			}
		}
		return count;
	}
}