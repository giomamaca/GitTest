import acm.program.ConsoleProgram;

public class MidTerm2 extends ConsoleProgram {
	public void run() {
		String father = readLine();
		String son = readLine();
		if(isFath(father, son)){
			println("correct");
		}
	}

	private boolean isFath(String father, String son) {
		String so = "";
		for (int i = 0; i < son.length(); i++) {
			for (int j = i+1; j < son.length(); j++) {
				String s = son.substring(i, j);
					so = s;
					if (father.contains(s) && so.length() >= father.length() / 2){ 
						return true;
					}
			}
		}
		return false;
	}
}
