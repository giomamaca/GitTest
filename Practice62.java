import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Practice62 extends ConsoleProgram{	
	public void run(){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		while(true){
			String name = readLine();
			if(name.isEmpty()){
				break;
			}
			
			map.put(name, map.get(name) + 1);
		}
		println(map);
	}
		
	private void run1(){
		ArrayList<String> list = new ArrayList<String>();
		String s = readLine();
		list.add(s);
		
		while(!s.equals("")){
			s = readLine();
			list.add(s);
		}
		for(int i = 0; i < list.size(); i++){
			String a = list.get(i);
			for(int j = i + 1; j < list.size(); j++){
				String b = list.get(j);
				if(a.equals(b)){
					println(i + " and " + j);
				}
			}
		}
	}
}
