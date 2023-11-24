import acm.program.ConsoleProgram;

public class Practice30 extends ConsoleProgram{
//	private int reverseNumber(int n){
//		int k = 0;
//		while(n > 0){
//			k = k * 10 + n % 10;
//			n = n / 10;
//		}
//		return k;
//	}
	public void run(){
		int a = readInt("?");
		int k = 0;
		while(a > 0){
			k = k * 10 + a % 10;
			a = a / 10;
		}
		println(k);
	}
}