import acm.program.ConsoleProgram;

public class Practice23 extends ConsoleProgram{
	
	private int sum(int k){
		int n = 0;
		for(int i = 0; true; i++){
			n = n + 1;
			return n;
		}
	}
	
	public void run(){
		int k = readInt("enter num = ");
		println(sum(k));
	}
}
