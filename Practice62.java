import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Practice62 extends ConsoleProgram{	
	public void run2(){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		while(true){
			String name = readLine();
			if(name.isEmpty()){
				break;
			}
			map.put(name, map.getOrDefault(name, 0) + 1);
		}
		println(map);
	}
}
