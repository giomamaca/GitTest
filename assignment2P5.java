import acm.program.ConsoleProgram;

public class assignment2P5 extends ConsoleProgram{
	
	private static final int STOP = 0;
	
	public void run(){
		println("This program finds smallest and largest numbers.");
		int large = readInt("?");
		int small = large;
		if(large != STOP){
			while(true){
				int k = readInt("?");
				if(k == STOP){
					break;
				}else{
					if(k > large){
						large = k;
						println("largest: " + large);
					}
					if(k < large){
						small = k;
						println("smalest: " + small);
					}
				}
			}
		}
	}
}
