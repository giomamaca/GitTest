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
			a2 = a;
			count++;
			if(a == SENTINEL){
				break;
			}
			if(count == 2){
				d = a2 - a1;
			}else{
				if((a2 - a1) != d){
					answer = "not";
				}
			}
			a1 = a2;
		}
		print(answer);
	}
}
