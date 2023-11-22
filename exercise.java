import acm.program.ConsoleProgram;

public class exercise extends ConsoleProgram {
	public void run() {
		String s = readLine("Enter string: ");
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			char next = s.charAt(i);
			int digit = next - '0';
			result = result * 10 + digit;
		}
		println(result);
	}
}
