import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class MidTerm1624 extends ConsoleProgram{
	public void run(){
		String text = readLine();
		println(unEvilText(text));
	}
	private String unEvilText(String text){
		String answer = "";
		
		StringTokenizer tok = new StringTokenizer(text, " ");
		
		while(tok.hasMoreTokens()){
			String s = tok.nextToken();
			for(int i = 0; i < s.length(); i++){
				char a = s.charAt(i);
				char b = s.charAt(i -1);
				
				if(a == b){
					String sub1 = s.substring(0, i - 1);
					String sub2 = s.substring(i);
					answer = sub1 + sub2;
					return;
				}
			}
		}
	}
}