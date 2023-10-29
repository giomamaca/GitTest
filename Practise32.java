import acm.program.ConsoleProgram;

public class Practise32 extends ConsoleProgram{
	
	private int divisiors(int a){
		for(int i = 0; i < a; i++){
			a = 0 + i*1;
			return a;
		}
		return 0;
	}
	
	public void run(){
		int k = readInt("enter a = ");
		println(divisiors(k));
	}
}
