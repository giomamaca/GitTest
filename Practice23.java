import acm.program.ConsoleProgram;

public class Practice23 extends ConsoleProgram{	
	public void run(){
		int sum = readInt("enter number = ");
		int n = 0;
		for(int i = 1; i < sum; i++){
			n += i; 
		}
		println("sum = " + sum);
	}
}
