import acm.program.ConsoleProgram;

public class assignment2P5 extends ConsoleProgram{
	
	private static final int STOP = 0;

	private int SmallLarge(int a){
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
					}
					if(k < small){
						small = k;
					}
				}
			}
		}
		if(large > small){
			return large;
		}
		if(small < large){
			return small;
		}
	}
	
	public void run(){
		println("This program finds smallest and largest numbers.");
		int c = readInt("?");
		println(SmallLarge(c));
	}
}
