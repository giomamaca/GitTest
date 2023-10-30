import acm.program.ConsoleProgram;

public class assignment2P5 extends ConsoleProgram{
	
	private static final int STOP = 0;
	
	public void run(){
		println("This program finds smallest and largest numbers.");
		int large = readInt("?");
		int small = large;
		if(large != STOP){
			while(small != 0){
				int k = readInt("?");
				if(k != STOP){
					if(k > large){
						large = k;
					}
					if(k < large){
						small = k;
					}
				}else{
					break;
				}
			}
		}
			println("largest : " + large);
			println("smallest: " + small);
	}
}
