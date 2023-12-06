import acm.program.ConsoleProgram;

public class Practice47 extends ConsoleProgram {
	public void run() {
		String s = readLine();
		println(izPredicat(s));
	}

	private boolean izPredicat(String s) {
		String str = "";
		for(int i = s.length(); i > 0; i--){
			char a = s.charAt(i);
			str += a;
		}
	if(str==s){	
		return true;
	}
	
	return false;
	}
}
