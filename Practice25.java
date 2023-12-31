import acm.program.ConsoleProgram;

public class Practice25 extends ConsoleProgram{
	
	private int divisors(int d, int p){
		int l = 1;
		for(int i = 2; i >= 2; i++){
			if(d % i == 0 & p % i == 0){
				l = i;
			}
		}
		d = d / l;
		p = p / l;
		int gcd = d * p * l;
		return gcd;
	}
	
	public void run(){
		int c = readInt("c = ");
		int k = readInt("k = ");
		println(divisors(c, k));
	}
}
