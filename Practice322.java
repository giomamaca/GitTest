import acm.program.ConsoleProgram;

public class Practice322 extends ConsoleProgram{
	
	private boolean isSimple(int k){
		if(k == 1) return false;
		if(k == 2) return true;
		if(k % 2 == 0) return false;
		for(int i = 3; i <= k; i += 2){
			if (k % i == 0){
				return false;
			}
		}
		return true;
	}
	
	private void milion(){
		for(int i = 2; i < 1000; i++){
			if(isSimple(i)){
				println("? " + i);
			}
		}
	}
	
	public void run(){
		milion();
	}
}
