import acm.program.ConsoleProgram;

public class Practice322 extends ConsoleProgram{
	
	private boolean isSimple(int a){
		if(a == 1) return false;
		if(a % 2 == 0) return false;
		if(a == 2) return true;
		for(int i = 3; i <= a; i += 2){
			if(a % i == 0){
				return false;
			}
		}
		return true;
	}
	
	private void milion(){
		int k = readInt("");
		for(int j = 0; j <= k; j++){
			if(isSimple(k)){
				print(j);
			}
		}
	}
	
	public void run(){
		milion();
	}
}
