import acm.program.ConsoleProgram;

public class MidTerm172 extends ConsoleProgram{
	public void run(){
		int k = readInt();
		int div = 0;
		for(int i = 1; i <= k; i++){
			if(k % i == 0 && simple(i)){
				div = i;
			}
		}
	}

	private boolean simple(int i) {
		if(i == 1) return false;
		if(i % 2 == 0) return false;
		for(int j = 3; j * j < i; j+=2){
			if(i % j ==0) return false;
		}
		return true;
	}
}
