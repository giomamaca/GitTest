import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice66 extends ConsoleProgram{
	private String save;
	private String guy1;
	private String guy2;
	public void run() {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		HashSet<String> set = new HashSet<String>();

		while (true) {
			ArrayList<String> list = new ArrayList<String>();
			String s = readLine();

			StringTokenizer tk = new StringTokenizer(s);
			int c = 0;
			while (tk.hasMoreTokens()) {
				String str = tk.nextToken();
				if(c % 2 == 0){
					list.add(str);
					save = str;
				}else{					
					if(map.containsKey(str)){
						map.get(str).add(save);
					}else{						
						map.put(str, list);
					}
					set.add(str);
				}
				c++;
			}
		}
	}
}
