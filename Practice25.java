import acm.program.ConsoleProgram;

public class Practice25 extends ConsoleProgram{
	private int LCM(int a, int b){
		if(a > b){
			if(a % b == 0){
				return a;
			}else{
				for(int i = 0; i*i < a; i++){
					if(a % i == 0){
						print(i);
					}
					a = a / i;
					b = b / i;
					int d = a * b * i;
					print(d);
				}
			}
		}
		return a;
	}
	
	public void run(){
		int c = readInt("c = ");
		int k = readInt("k = ");
		println(LCM(c, k));
	}
}
