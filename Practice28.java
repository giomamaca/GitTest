import acm.program.ConsoleProgram;

public class Practice28 extends ConsoleProgram{
	
	private static final double SENTINEL = -1;
	
	public void run(){
		int answer = 0;
		while(true){
			int a = readInt();
			if(a == SENTINEL){
				println(answer);
			}else{
				if(a % 2 == 0){
					answer++;
				}
			}
		}
		
	}
}
