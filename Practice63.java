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
		for(int i = 0; i < list.size(); i++){
			StringTokenizer tk = new StringTokenizer(list.get(i), " ");
			
			while(tk.hasMoreTokens()){
				String str = tk.nextToken();
			}
		}
	}
}
