import acm.program.ConsoleProgram;

public class Practise32 extends ConsoleProgram{
	
	
	private boolean isSimple(int k){
		if(k == 1) return false;
		if(k == 2) return true;
		if(k % 2 == 0) return false;
		for(int i = 3; i * i <= k; i += 2) {
			if (k % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public void run(){
		int a = readInt ();
		print(isSimple(a));
	}
}
