import acm.program.ConsoleProgram;

public class Practice15  extends ConsoleProgram{
	public void run(){
		println ("write numbers and get their middle");
		int x1 = readInt ("enter n1=");
		int x2 = readInt ("enter n2=");
		double middle = (double) (x1 + x2) / 2;
		
		println(middle);
	}
}
