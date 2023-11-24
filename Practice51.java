import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice51 extends ConsoleProgram {
	public void run() {
		String s = readLine("enter string : ");
		println(duble(s));
	}

	private String duble(String s) {
		String answer = "";
		for(int i = 0; i < s.length(); i++){
			if(i == 0 || s.charAt(i) != s.charAt(i - 1)){
				answer += s.charAt(i);
			}
		}
		return answer;
	}
}
