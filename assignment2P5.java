import acm.program.ConsoleProgram;

public class assignment2P5 extends ConsoleProgram{
	
	private int SmallLarge(int a){
		for(int i = 0; true; i++){
			if(a != 0 ){
				int k = readInt("?");
			}else break;
		}
		return a;
	}
	
	public void run(){
		println("This program finds smallest and largest numbers.");
		int c = readInt("?");
		println(SmallLarge(c));
	}
}
