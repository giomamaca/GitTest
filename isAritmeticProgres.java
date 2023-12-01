import acm.program.ConsoleProgram;

public class isAritmeticProgres extends ConsoleProgram{
	
	private static final double SENTINEL = -1;
	
	public void run(){
		String answer = "correct";
		int a1 = readInt();
		int a2 = a1;
		int count  = 1;
		int d = 0;
		while(true){
			int a = readInt();
			count++;
			if(a == SENTINEL){
				break;
			}
			if(count == 2){
				d = a - a1;
			}else{
				if((a - a1) != d){
					answer = "not";
				}
			}
		}
		print(answer);
	}
}
