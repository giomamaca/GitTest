import acm.program.ConsoleProgram;

public class assignment2P6 extends ConsoleProgram{
	public void run(){
		int a = readInt ("enter number = ");
		while(a != 1){
			if(a % 2 == 0){
				a = a / 2;
			}else{
				a = a*3 + 1;
			}
		}
	}
}
