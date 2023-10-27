import acm.program.ConsoleProgram;

public class Practice30 extends ConsoleProgram{
	private int reverseNumber(int n){
		int result = 0;
		int k = 0;
		while(n > 0){
			k = k * 10 + n % 10;
			int digital = n / 10;
		}
		return k;
	}
	public void run(){
		int a = readInt("?");
		println(reverseNumber(a));
	}
}