import acm.program.ConsoleProgram;

public class Practice27 extends ConsoleProgram{
	public void run(){
		double n = readInt("");
		double m = readInt("");
		for(int i = 0; i <= m; i++){
			n = n * n;
		}
		print(n);
	}
}
