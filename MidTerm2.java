import acm.program.ConsoleProgram;

public class MidTerm2 extends ConsoleProgram {
	public void run() {
		String son = readLine();
		String father = readLine();
		
		if(isFather(son, father)){
			println("is son");
		}else{
			println("not");
		}
	}

	private boolean isFather(String son, String father) {
		String s = "";
		for(int i = 0; i< son.length(); i++){
			for(int j = 0; j < son.length(); j++){
				s = son.substring(i, j);
			}
		}
		if(father.contains(s)){
			return true;
		}
		return false;
	}
}
