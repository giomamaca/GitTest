import acm.program.ConsoleProgram;

public class Practice47 extends ConsoleProgram {
	public void run() {
		String s = readLine();
		println(isPredicat(s));
	}

	private boolean isPredicat(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			str = a + str;
		}
		if (str == s) {
			return true;
		}

		return false;
	}
}
