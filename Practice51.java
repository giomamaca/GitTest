import acm.program.ConsoleProgram;

public class Practice51 extends ConsoleProgram{
	public void run(){
		String s = readLine("enter string : ");
		for(int i = 0; i < s.length(); i++){
			for(int j = 1; j < s.length(); j++){
				char a = s.charAt(i);
				char b = s.charAt(j);
				if(a != b){
					print(s);
				}				
			}
		}
	}
}
