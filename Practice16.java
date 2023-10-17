import acm.program.ConsoleProgram;

public class Practice16 extends ConsoleProgram{
	public void run(){
		println ("write numbers and get");
		int a = readInt ("enter a = ");
		int b = readInt ("enter b = ");
		int c = readInt ("enteer c = ");
		double harmonic = (double) 1 / ((1 / a) + (1 / b) + c);
		print(harmonic);
	}
}
