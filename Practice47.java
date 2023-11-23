import acm.program.ConsoleProgram;

public class Practice47 extends ConsoleProgram{
	public void run(){
		String s = readLine("enter string : ");
		if(isPredicat(s)){
			println("predicat");
		}else{
			println("not predicat");
		}
	}

	private boolean isPredicat(String s) {
		for(int i = 0; i < 26; i++){
			char a = s.charAt(i);
			char b = s.charAt(s.length() - i - 1);
			if(a == b){
				return false;
			}
		}
		return true;
	}
}
