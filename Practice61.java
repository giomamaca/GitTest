import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice61 extends ConsoleProgram{
	public void run(){
		int count = 0;
		
		int m = readInt();
		int n = readInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(count != n){
			int num = readInt();
			list.add(num);
			count++;
		}
		for(int i = 0; i < list.size() - 1; i++){
			int a = list.get(i);
			for(int j = i; j < list.size(); j++){
				int b = list.get(j);
				if((a + b) == m){
					println(i + "and" + j);
				}
			}
		}
	}
}
