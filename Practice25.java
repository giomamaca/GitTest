import acm.program.ConsoleProgram;

public class Practice25 extends ConsoleProgram{
	
	private int divisors(int d, int p){
		int l = 0;
		for(int i = 2; i > 0; i++){
			if(d % i == 0 & p % i == 0){
				l = i;
			}
		}
		if(d % l == 0){
			d = d / l;
		}else{
			d = d;
		}
		if(p % l == 0){
			p = p / l;
		}else{
			p  = p;
		}
		l = d * p * l;
		
		return l;
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
