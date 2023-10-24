import acm.program.ConsoleProgram;

public class exercise extends ConsoleProgram{
	public void run(){
		int a = readInt ("enter num1 = ");
		int b = readInt ("enter num2 = ");
		
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		print(c);
	}
}
