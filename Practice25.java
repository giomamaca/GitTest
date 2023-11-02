import acm.program.ConsoleProgram;

public class Practice25 extends ConsoleProgram{
	
	private int divisors(int d, int p){
		int o = 0;
		int l = 0;
		for(int i = d; i >= 2; i--){
			if(d % i == 0 & p % i == 0){
				l = i;
			}
		}
		d = d / l;
		p = p / l;
		o = (d * p)l* l;
		return o;
	}
	
//	private int LCM(int a, int b){
//		
//	}
	
	public void run(){
		int c = readInt("c = ");
		int k = readInt("k = ");
		println(divisors(c, k));
	}
}
