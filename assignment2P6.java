import acm.program.ConsoleProgram;

public class assignment2P6 extends ConsoleProgram{
	
	private int oddOrEven(int k){
		int a = readInt ("");
		while(a != 1){
			if(a % 2 == 0){
				a = a / 2;
			}else{
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
