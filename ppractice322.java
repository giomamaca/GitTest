import acm.program.ConsoleProgram;

public class ppractice322 extends ConsoleProgram {

	private int num = 1000;

	public void run() {
		milion();
	}

	private void milion() {
		for(int j = 1; j < 100; j++){
			int gamyofebi = divisors(j);
			
			if(gamyofebi == 2){
				println(j);
			}
		}
	}
	
	private int divisors(int a){
		int k = 0;
		for(int i = 1; i < 100; i++){
			if(a % i == 0){
				k++;
			}
		}
		return k;
	}
}
