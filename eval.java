import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class eval extends ConsoleProgram{
	public void run(){
		String s = readLine();
		angarishi(s);
	}

	private int angarishi(String s) {
		StringTokenizer tok = new StringTokenizer(s, " ");
		
		while(tok.hasMoreTokens()){
			print(tok.nextToken());
		}
		return 0;
	}
}
