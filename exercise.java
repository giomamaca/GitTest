import acm.program.ConsoleProgram;

public class exercise extends ConsoleProgram{	
	
	private static int specialNum = 0;
	
	public void run(){
		int max = readInt("");
		int min = max;
		if(max == specialNum){
			println("dasdadadad");
		}else{
			while(true){
				int a = readInt("");
				if(a == specialNum){
					break;
				}else{
					if(a < min){
						min = a;
					}
					if(a > max){
						max = a;
					}
				}
			}
		}
		println("largest" + max);
		println("small" + min);
	}
}
