import acm.program.ConsoleProgram;

public class Practice56 extends ConsoleProgram{
	public void run(){
		int n = readInt();
		
		int[] arr;
		
		arr = new int[n];
		
		for(int i = 0; i < arr.length; i++){
			int k = readInt();
			println("arr#" + i + "[" + k + "]");
			if(zrdadia(arr)){
				println("sorted");
			}else{
				println("notSorted");
			}
		}
	}

	private boolean zrdadia(int[] arr) {
		for(int i = 0; i < arr.length -1; i++){
			if(arr[i] < arr[i + 1]){
				return true;
			}
		}
		return true;
	}
}
