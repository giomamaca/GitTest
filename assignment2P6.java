import acm.program.ConsoleProgram;

public class assignment2P6 extends ConsoleProgram{
	public void run(){
		int a = readInt ("enter number = ");
		
		if(a % 2 ==0){
			int c = (a / 2);
			print(c);
		}
	}
}
