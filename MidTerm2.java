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
		for (int i = 0; i < son.length(); i++) {
			for (int j = 0; j < son.length(); j++) {
				String s = son.substring(i, j);
				for (int a = 0; a < father.length(); a++) {
					for (int b = 0; b < father.length(); b++) {
						String f = father.substring(a, b);
						if (s == f) return true;
					}
				}
			}
		}
		return false;
	}
}
