import acm.program.ConsoleProgram;

public class assignment2P6 extends ConsoleProgram{
	
	private int oddOrEven(int k){
		int a = readInt ("enter number = ");
		while(a != 1){
			if(a % 2 == 0){
				println("" + a);
				a = a / 2;
			}else{
				println("" + a);
				a = a*3 + 1;
			}
		}
		return a;
	}
	
	public void run(){
		int c = readInt("");
		println(oddOrEven(c));
	}
}
