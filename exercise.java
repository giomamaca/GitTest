import acm.program.ConsoleProgram;

public class exercise extends ConsoleProgram{		
	public void run(){
		int max = readInt("");
		int min = max;
		if(max == 0){
			println("dasdadadad");
		}else{
			while(true){
				int a = readInt("");
				if(a == 0){
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
		println("largest " + max);
		println("small " + min);
	}
}
