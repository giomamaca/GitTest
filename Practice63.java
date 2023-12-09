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
		int count = 1;
		
		String friend = "";
		
		for(int i = 0; i < list.size(); i++){
			StringTokenizer tk = new StringTokenizer(" ");
			while(tk.hasMoreTokens()){
				String s = tk.nextToken();
				if(count % 2 == 1){
					friend += s;
				}
				count++;
			}
		}
		
		return answer;
	}
}
