import acm.program.ConsoleProgram;

public class Practice27 extends ConsoleProgram{
	public void run(){
		int n = readInt ("enter n = ");
		int m = readInt ("enter m = ");
		for(int i = 0; i < m ; i++){
		    int	a = n * m;
			print(a);
		}
	}
}
