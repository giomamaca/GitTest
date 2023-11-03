import acm.program.ConsoleProgram;

public class ppractice322 extends ConsoleProgram {

	private int num = 1000;

	// private void divisors(){
	// int c = 0;
	// for(int i = 2; i < num; i++){
	// if(num % i == 0){
	// c++;
	// if(c == 2){
	// print(i);
	// }else{
	// c = 0;
	// }
	// }
	// }
	// }

	public void run() {
		int c = 0;
		for (int j = 1; j < 100; j++){
			for (int i = 1; i < 100; i++){
				if(i % j == 0){
					c++;
				}
			}
			if(c == 2){
				println(j);
				c = 0;
			}
		}
	}
}
