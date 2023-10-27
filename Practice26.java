import acm.program.ConsoleProgram;

public class Practice26 extends ConsoleProgram{
	private int gcd (int a, int b){
		while( a != 0 && b != 0){
			if(a > b){
				a %= b;
			}else{
				b %= a;
			}
		}
		if(a == 0){
			return b;
		}
		return a;
	}
	
	// 24 16 16 8 8 0  
	public void run(){
		int a =readInt("a = ");
		int b = readInt("b = ");
		int g = gcd(a,b);
		println("gcd is:" + g);
	}
}
