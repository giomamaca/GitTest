import acm.program.ConsoleProgram;

public class MidTerm1 extends ConsoleProgram{
	public void run(){
		int count = 0;
		int n = readInt();
		int m = readInt();
		while (n <= m){
			n *= n;
			count++;
		}
	}
}
