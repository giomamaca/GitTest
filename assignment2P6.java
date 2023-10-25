import acm.program.ConsoleProgram;

public class assignment2P6 extends ConsoleProgram{
	public void run(){
		int a = readInt ("enter number = ");
		for(int i = 1; true; i--){
			if(a % 2 == 0){
				int c = a / (i*2) ;
				print(c);
			}
		}
	}
}
