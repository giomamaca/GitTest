import acm.program.ConsoleProgram;

public class assignment2P5 extends ConsoleProgram{
	

	private int SmallLarge(int a){
		for(int i = 0; true; i++){
			int k = readInt("?");
			if(k == 0){
				return k;
			}
		}
	}
	
	public void run(){
		println("This program finds smallest and largest numbers.");
		int c = readInt("?");
		println(SmallLarge(c));
	}
}
