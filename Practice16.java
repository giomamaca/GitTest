import acm.program.ConsoleProgram;

public class Practice16 extends ConsoleProgram{
	public void run(){
		println ("write numbers and get");
		double a = readInt ("enter a = ");
		double b = readInt ("enter b = ");
		double c = readInt ("enteer c = ");
		
		
		println(1 / (1/a + 1/b  + 1/c));
	}
}
