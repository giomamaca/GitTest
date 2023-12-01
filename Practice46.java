import acm.program.ConsoleProgram;

public class Practice46 extends ConsoleProgram{
	public void run(){
		String s = readLine();
		char chr = 'a';
		int max = 1;
		int min = 0;
		
		
		for(int i = 0; i < s.length(); i++){
			char a = s.charAt(i);
			for(int j = 0; j < s.length(); j++){
				char b = s.charAt(j);
				if(a == b){
					min++;
				}
			}
		}
		if(min > max){
			max = min;
			min = 0;
		}
		println(max);
	}
}
