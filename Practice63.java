import java.util.ArrayList;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice63 extends ConsoleProgram{
	public void run(){
		ArrayList<String> list = new ArrayList<String>();
		String s = readLine();
		list.add(s);
		
		while(!s.equals("")){
			s = readLine();
			list.add(s);
			
		}
		println(moreFriend(list));
	}

	private String moreFriend(ArrayList<String> list) {
		String answer = "";
		int count = 0;
		
		
		for(int i = 0; i < list.size(); i++){
			StringTokenizer tk = new StringTokenizer(" ");
			while(tk.hasMoreTokens()){
				String s = tk.nextToken();
				
			}
		}
		
		return answer;
	}
}
