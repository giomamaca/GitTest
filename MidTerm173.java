import acm.program.ConsoleProgram;

public class MidTerm173 extends ConsoleProgram{
	public void run(){
		String gamarjoba = readLine();
		String baro = readLine();
		println(isIn(gamarjoba, baro));
		
	}

	private boolean isIn(String gamarjoba, String baro) {
		String sub = gamarjoba;
		String dzm = baro;
		
		for(int i = 0; i< dzm.length(); i++){
			char bar = dzm.charAt(i);
			for(int j = 0; j < sub.length(); j++){
				char gam = sub.charAt(j);
				if(bar == gam){
					sub = sub.substring(i) + sub.substring(i + 1);
					System.out.println(sub);
				}
			}
		}
		return false;
	}
}
