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
			if(s.charAt(i) != s.charAt(i - 1) || i == 0){
				answer += s.charAt(i);
			}
		}
		return answer;
	}
}
