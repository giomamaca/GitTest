import acm.program.ConsoleProgram;

public class Practice26 extends ConsoleProgram{
	private static final int GRID_SIZE = 30;
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
	public void run(){
		int a =readInt();
		int b = readInt();
		int g = gcd(a,b);
		println("gcd is:" + g);
	}
}
