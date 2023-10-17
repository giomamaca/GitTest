import acm.program.ConsoleProgram;

public class Practice16 extends ConsoleProgram{
	public void run(){
		println ("write numbers and get");
		int a = 1 / readInt ("enter a = ");
		int b = 1 / readInt ("enter b = ");
		int c = 1 / readInt ("enteer c = ");
		double harmonic = (double) 1/(a + b + c);
		print(harmonic);
	}
}
