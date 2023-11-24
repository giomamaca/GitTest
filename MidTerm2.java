import acm.program.ConsoleProgram;

public class MidTerm2 extends ConsoleProgram{
	public void run(){
		String father = readLine();
		String son = readLine();
		println(isFath(father, son));
	}

	private boolean isFath(String father, String son) {
		for(int i = 0; i < son.length(); i++){
			char s1 = son.charAt(i);
			char s2 = son.charAt(i + 1);
			for(int j = 0; i< father.length(); j++){
				char f1 = father.charAt(j);
				char f2 =father.charAt(j + 1);
				if(s1 == f1){
					return true;
				}
			}
		}
		return false;
	}	
}
