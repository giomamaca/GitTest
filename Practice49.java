import acm.program.ConsoleProgram;

public class Practice49 extends ConsoleProgram{
	public void run(){
		String s = readLine("enter string : ");
		int result = 0;
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			int a = c - '0';
			result = result * 10 + a;
		}
		print(result);
	}
}
