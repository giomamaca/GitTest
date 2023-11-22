import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice50 extends ConsoleProgram{
	public void run(){
		String s = readLine("enter string : ");
		println("Tokens are : ");
		printTokens(s);
	}

	private void printTokens(String s) {
		StringTokenizer tokenizer = new StringTokenizer(s, " ");
		int count = 1;
		while(tokenizer.hasMoreTokens()){
			println("Token #" + count + ":" + tokenizer.nextToken());
			count++;
		}
	}
}
