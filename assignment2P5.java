import acm.program.ConsoleProgram;

public class assignment2P5 extends ConsoleProgram{
	

	private int SmallLarge(int a){
		int large = readInt("?");
		while(a !=0){
			if(large != 0){
				while(true){
					int k = readInt("?");
					if(k > large){
						k = large;
					}
				}
			}
		}else{
			return a;
		}
		return large;
	}
	
	public void run(){
		println("This program finds smallest and largest numbers.");
		int c = readInt("?");
		println(SmallLarge(c));
	}
}
