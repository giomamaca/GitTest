import acm.program.ConsoleProgram;

public class assignment2P5 extends ConsoleProgram{
	

	private int SmallLarge(int a){
		while(a != 0){
			a = readInt("?");
			if(a > 0){
				return Math.max(0, a);
			}else{
				return Math.min(a, 0);
			}
		}
		return a;
	}
	
	public void run(){
		println("This program finds smallest and largest numbers.");
		int c = readInt("?");
		println(SmallLarge(c));
	}
}
