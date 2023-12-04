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
			String cor = "";
			int count = 1;
			char wrong = 'a';
			for(int i = 1; i < s.length(); i++){
				char a = s.charAt(i);
				char b = s.charAt(i - 1);
				if(a == b){
					wrong = a;
					for(int k = 0; k < s.length(); k++){
						if(s.charAt(i) == wrong){
							count++;
						}
					}
					String sub1 = s.substring(0, i - 1);
					String sub2 = s.substring(i + count);
					cor = sub1 + sub2;
				}
			}
			System.out.println(cor);
			for(int j = 0; j < s.length(); j++){
				char c = s.charAt(j);
				if(c != wrong){							
					cor += c;
				}
			}
			str += cor + " ";
		}
		return str;
	}
}