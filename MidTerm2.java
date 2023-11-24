import acm.program.ConsoleProgram;

public class MidTerm2 extends ConsoleProgram{
	public void run(){
		String father = readLine();
		String son = readLine();
		println(isFath(father, son));
	}

	private boolean isFath(String father, String son) {
		for(int i = 0; i < son.length(); i++){
			char a = son.charAt(i);
			for(int j = 0; i< father.length(); j++){
				
			}
		}
		return false;
	}	
}
