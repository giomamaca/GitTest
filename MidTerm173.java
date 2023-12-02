import acm.program.ConsoleProgram;

public class MidTerm173 extends ConsoleProgram{
	public void run(){
		String gamarjoba = readLine();
		String baro = readLine();
		println(isIn(gamarjoba, baro));
		
	}

	private boolean isIn(String gamarjoba, String baro) {
		String sub = gamarjoba;
		
		for(int i = 0; i< baro.length(); i++){
			char bar = baro.charAt(i);
			for(int j = 0; j < sub.length(); j++){
				char gam = sub.charAt(j);
				if(bar == gam){
					String s = sub.substring(0, j) + sub.substring(j+1); 
					sub = s;
					System.out.println(sub);
					return true;
				}
			}
		}
		return false;
	}
}
