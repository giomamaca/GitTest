import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class eval extends ConsoleProgram{
	
	
	public void run(){
		String s = readLine();
		println(angarishi(s));
	}

	private int angarishi(String s) {
		StringTokenizer tok = new StringTokenizer(s, " ");
		int i = Integer.parseInt(tok.nextToken()); 
		
		while(tok.hasMoreTokens()){
			String a = tok.nextToken();
			int num = Integer.parseInt(tok.nextToken()); 
			if(a.charAt(0) == '+'){
				i += num;
			}else{
				i -= num;
			}
		}
		return i;
	}
	
	private int convertToInt(String s){
		int num = 0;
		
		for(int i = 0;i < s.length(); i++){
			int current = s.charAt(i) - '0';
			num = num * 10 + current;
		}
		return num;
	}
}
