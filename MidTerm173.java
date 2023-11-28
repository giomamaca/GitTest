import acm.program.ConsoleProgram;

public class MidTerm173 extends ConsoleProgram{
	public void run(){
		String gamarjoba = readLine();
		String baro = readLine();
		println(isIn(gamarjoba, baro));
		
	}

	private boolean isIn(String gamarjoba, String baro) {
		
		for(int i = 0; i< baro.length(); i++){
			char bar = baro.charAt(i);
			for(int j = i; j < gamarjoba.length(); j++){
				char gam = gamarjoba.charAt(j);
				if(bar == gam){
					return true;
				}
			}
		}
		return false;
	}
}
