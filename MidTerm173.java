import acm.program.ConsoleProgram;

public class MidTerm173 extends ConsoleProgram {
	public void run() {
		String a = readLine();
		String b = readLine();
		println(isIn(a, b));
	}

	private boolean isIn(String a, String b) {
		String gam = a;
		String bar = b;

		for (int i = 0; i < bar.length(); i++) {
			char x = bar.charAt(i);
			for (int j = 0; j < gam.length(); j++) {
				char y = gam.charAt(j);
				if (x == y) {
					bar = bar.substring(0, i) + bar.substring(i + 1);
					gam = gam.substring(0, j) + gam.substring(j + 1);
					System.out.println(bar);
					System.out.println(gam);
					
				}
			}
		}
		return true;
	}
}
