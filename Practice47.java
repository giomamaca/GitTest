import acm.program.ConsoleProgram;

public class Practice47 extends ConsoleProgram{
	public void run(){
		String s = readLine();
		println(isPredicat(s));
	}

	private boolean isPredicat(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			str = s.charAt(i) + str;
		}
		if (str.equals(s)) {
			return true;
		}
		return false;
	}
}
