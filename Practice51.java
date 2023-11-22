import acm.program.ConsoleProgram;

public class Practice51 extends ConsoleProgram{
	public void run(){
		String s = readLine("enter string : ");
		for(int i = 0; i < s.length(); i++){
				char a = s.charAt(i);
				if(a == (char)(a - 1)){
					break;
			}else{
				print(s);
			}
		}
	}
}
