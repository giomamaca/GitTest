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
		
		int ba = 0;
		int ga = 0;

		for (int i = 0; i < bar.length(); i++) {
			char x = bar.charAt(i);
			
			for (int j = 0; j < gam.length(); j++) {
				char y = gam.charAt(j);
				
				if(x != y) return false;
				
				if (x == y) {
					for(int k = 0; k < gam.length(); k++){
						if(gam.charAt(k) == x){
							ga++;
						}
					}
					for(int l = 0; l < bar.length(); l++){
						if(bar.charAt(l) == x){
							ba++;
						}
						System.out.println(ba);
						System.out.println(ga);
						if(ba <= ga){
							ba = 0;
							ga = 0;
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
