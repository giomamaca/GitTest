import acm.program.ConsoleProgram;

public class assignment2P5 extends ConsoleProgram{
	

	private int SmallLarge(int a){
		int large = readInt("?");
		if(large == 0){
			println("");
		}else{
			while(true){
				int k = readInt("?");
				if(k == 0){
					break;
				}else{
					if(k > large){
						large = k;
					}
					if(k < large){
						return k;
					}
				}
			}
		}
		return large;
	}
	
	public void run(){
		println("This program finds smallest and largest numbers.");
		int c = readInt("?");
		println(SmallLarge(c));
	}
}
