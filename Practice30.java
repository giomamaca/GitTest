import acm.program.ConsoleProgram;

public class Practice30 extends ConsoleProgram{
	private int reverseNumber(int n){
		int result = 0;
		while(n > 0){
			int digital = n / 10;
			result += digital;
			n /= 10;
			
		}
		return result;
	}
	public void run(){
		int a = readInt("?");
		println(reverseNumber(a));
	}
}