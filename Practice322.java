import acm.program.ConsoleProgram;

public class Practice322 extends ConsoleProgram{
	
	private int milion(int k){
		int result = 0;
		for(int i = 1; i <=k; i++){
			for(int j = 1; j <= i; i++){
				if(i % j == 0){
					result ++;
				}
				if(result == 2){
					print(i);
				}
			}
		}
	}
	
	public void run(){
		int c = readInt("");
		println(milion(c));
	}
}
