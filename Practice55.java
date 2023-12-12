import acm.program.ConsoleProgram;

public class Practice55 extends ConsoleProgram{
	public void run(){
		int n = readInt();
		isSorted(n);
		if(isSorted(n)){
			println("sorted");
		}else{
			println("not sorted");
		}
	}

	private boolean isSorted(int n) {
		int perv = 0;
		int curr = 0;
		for(int i = 0; i < n; i++){
			int num = readInt();
			perv = num;
			
			if(perv > curr){
				curr = perv;
			}else{
				return false;
			}
		}
		return true;
	}
}
