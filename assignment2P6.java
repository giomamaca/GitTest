import acm.program.ConsoleProgram;

public class assignment2P6 extends ConsoleProgram{
	public void run(){
		int a = readInt ("enter number = ");
		for(int i = 1; true; i--){
			while(a % 2 == 0){
				int c =i * (a / (i*2)) ;
				print(c);
			}
		}
	}
}
