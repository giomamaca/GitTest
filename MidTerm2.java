import acm.program.ConsoleProgram;

public class MidTerm2 extends ConsoleProgram {
	public void run() {
		String father = readLine();
		String son = readLine();
		println(isFath(father, son));
	}

	private boolean isFath(String father, String son) {
		String so = "";
		for (int i = 0; i < son.length(); i++) {
			for (int j = i+1; j < son.length(); j++) {
				 so = son.substring(i, j);
					if (father.contains(so) && so.length() >= father.length() / 2){ 
						return true;
					}
			}
		}
		return false;
	}
}
