import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice64 extends ConsoleProgram{
	public void run(){
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		while(true){
			int c = 1;
			ArrayList<String> list = new ArrayList<String>();
			String s = readLine();
			
			StringTokenizer tk = new StringTokenizer(s, " ");
			String str = tk.nextToken();
			if(c % 2 == 0){
				list.add(str);
			}
			c++;
			map.put(str, list);
			println(map);
		}
	}
}
