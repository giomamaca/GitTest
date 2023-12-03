import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class eval extends ConsoleProgram{
	public void run(){
		String s = readLine();
		angarishi(s);
	}

	private int angarishi(String s) {		
		int k = 0;
		int a = k;
		
		String str = "";
		
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if("" + ch != " "){
				str += ch;
				System.out.println(str);
			}
		}
		return 0;
	}
}
