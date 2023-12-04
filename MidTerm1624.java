import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class MidTerm1624 extends ConsoleProgram{
	public void run(){
		String text = readLine();
		println(unEvilText(text));
	}
	private String unEvilText(String text){
		StringTokenizer tok = new StringTokenizer(text, " ");
		String str = "";
		
		while(tok.hasMoreTokens()){
			String s = tok.nextToken();
			for(int i = 1; i < s.length(); i++){
				char a = s.charAt(i);
				char b = s.charAt(i - 1);
				
				if(a == b){
					String sub1 = s.substring(0, i - 1);
					String sub2 = s.substring(i + 1);
					
					str = str + sub1 + sub2 + " ";
				}else{
					str += s;
				}
			}
		}
		return str;
	}
}