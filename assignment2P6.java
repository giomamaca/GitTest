import acm.program.ConsoleProgram;

public class assignment2P6 extends ConsoleProgram{
	public void run(){
		int a = readInt ("enter number = ");
		if(a % 2 == 0){
			for(int i = 0; true; i++){
				int c = a / i*2;
				print(c);
			}
		}
	}
}
