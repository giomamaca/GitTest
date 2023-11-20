import acm.program.ConsoleProgram;

public class MidTerm1 extends ConsoleProgram{
	public void run(){
		int log = 1;
		int n = readInt("n = ");
		int m = readInt("m = ");
		while (n <= m){
			log++;
			n *= n;
		}
		print("log = " + log);
	}
}
