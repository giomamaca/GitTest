import acm.program.ConsoleProgram;

public class assignment2P5 extends ConsoleProgram{
	

	private int SmallLarge(int a){
		int large = readInt("?");
		while(a == 0){
					int k = readInt("?");
					if(k > large){
						k = large;
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
