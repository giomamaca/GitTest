import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice60 extends ConsoleProgram{
	public void run(){
		int k = readInt();
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		while(k != -1){
			list.add(k);
			k = readInt();
		}
		for(int i = list.size(); i > 0; i--){
			println(list.get(i));
		}
	}
}
