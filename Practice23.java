import acm.program.ConsoleProgram;

public class Practice23 extends ConsoleProgram{
	
	private int sum(int k){
		int n = readInt("dad");
		for(int i = 1; i <= n; i++){
			n = n + 1;
			return n;
		}
		return n;
	}
	
	public void run(){
		int k = readInt("enter num = ");
		println(sum(k));
	}
}
