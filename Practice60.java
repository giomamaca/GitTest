import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice60 extends ConsoleProgram{
	public void run(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int k = readInt();
		
		while(k != -1){
			list.add(k);
			k = readInt();
		}
		for(int i = list.size() - 1; i >= 0; i--){
			println(list.get(i));
			}
		}
}
