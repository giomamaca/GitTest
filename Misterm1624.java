import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Misterm1624 extends ConsoleProgram{
	public void run(){
		String text = readLine();
		println(unEvilText(text));
	}
	private String unEvilText(String text){
		String answer = "";
		
		StringTokenizer tok = new StringTokenizer(text, " ");
		
		while(tok.hasMoreTokens()){
			for(int i = 0; i< text.length(); i++){
				char a = text.charAt(i);
				char b = text.charAt(i-1);
				
				if(a == b){
					String sub1 = text.substring(0, i -1);
					String sub2 = text.substring(i);
					answer = sub1 + sub2;
				}
			}
		}
		return answer;
	}
}
