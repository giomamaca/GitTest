import acm.program.ConsoleProgram;

public class isAritmeticProgres extends ConsoleProgram{
	
	private static final double SENTINEL = -1;
	
	public void run(){
		String answer = "correct";
		int a1 = readInt();
		int count  = 1;
		int d = 0;
		while(true){
			int a = readInt();
			count++;
			if(a == SENTINEL){
				break;
			}
			if(count == 2){
				d = a1 - a;
			}else{
				if((a - a1) != d){
					answer = "not";
				}
			}
			a1 = a;
		}
	}
}
