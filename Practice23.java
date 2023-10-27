import acm.program.ConsoleProgram;

public class Practice23 extends ConsoleProgram{	
	public void run(){
		int sumFrom = readInt("enter number = ");
		int n = 0;
		for(int i = 0; i <= sumFrom; i++){
			n += i; 
		}
		println("sum = " + n);
	}
}
