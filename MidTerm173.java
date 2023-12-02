import acm.program.ConsoleProgram;

public class MidTerm173 extends ConsoleProgram {
	public void run() {
		String gamarjoba = readLine();
		String baro = readLine();
		println(isIn(gamarjoba, baro));

	}

	private boolean isIn(String gamarjoba, String baro) {
		String sub = gamarjoba;
		String dzma = baro;
		int n = baro.length();

		for (int i = 0; i < dzma.length(); i++) {
			char bar = dzma.charAt(i);
			for (int j = 0; j < sub.length(); j++) {
				char gam = sub.charAt(j);
				if (bar == gam) {
					String s = sub.substring(0, j) + sub.substring(j + 1);
					sub = s;
					String b = dzma.substring(0, i) + dzma.substring(i + 1);
					dzma = b;
				}
				System.out.println(sub);
			}
			if(dzma == null){
				return true;
			}
		}
		return false;
	}
}
