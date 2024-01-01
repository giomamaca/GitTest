import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice64 extends ConsoleProgram{
	public void run(){
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		while(true){
			String s = readLine();
			
			StringTokenizer tk = new StringTokenizer(s, " ");
			String str = tk.nextToken();
			println(str);
		}
	}
}
