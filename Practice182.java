import acm.program.ConsoleProgram;

public class Practice182 extends ConsoleProgram {
	public void run(){
		println("enter numbers");
		double a = readDouble ("enter num1");
		double b = readDouble ("enter num2");
		
		if( a > b){
			print(a);
		}else{
			print(b);
		}
	}
}