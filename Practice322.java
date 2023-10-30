import acm.program.ConsoleProgram;

public class Practice322 extends ConsoleProgram{
	
	private boolean isSimple(int a){
		if(a == 1) return false;
		if(a % 2 == 0) return false;
		if(a == 2) return true;
		for(int i = 3; i <= a; i += 2){
			if (a % i == 0){
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
