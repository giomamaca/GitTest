import acm.program.ConsoleProgram;

public class Practice47 extends ConsoleProgram{
	public void run(){
		String s = readLine("enter string : ");
		if(predicat(s)){
			println("predicat");
		}else{
			println("no predicat");
		}
	}

	private boolean predicat(String s) {
		for(int i = 0; i < s.length(); i++){
			char a = s.charAt(i);
			char b = s.charAt(s.length() - i -1);
			if(a != b){
				return false; 
			}
		}
		return true;
	}
}
