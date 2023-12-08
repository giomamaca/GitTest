import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice62 extends ConsoleProgram{
	public void run(){
		String s = readLine();
		
		ArrayList<String> list = new ArrayList<String>();
		
		while(!s.equals("")){
			s = readLine();
			list.add(s);
		}
		for(int i = 0; i < list.size() - i; i++){
			String a = list.get(i);
			System.out.println("a" + a);
			for(int j = i + 1; j < list.size() - 1; j++){
				String b = list.get(j);
				System.out.println("b" + b);
				if(a == b){
					println("aris");
				}
			}
		}
	}
}
