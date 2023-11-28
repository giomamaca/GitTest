import acm.program.ConsoleProgram;

public class MidTerm173 extends ConsoleProgram{
	public void run(){
		String gamarjoba = readLine();
		String baro = readLine();
		
		String s = "";
		
		for(int i = 0; i< baro.length(); i++){
			char bar = baro.charAt(i);
			for(int j = i; j < gamarjoba.length(); j++){
				char gam = gamarjoba.charAt(j);
				if(bar == gam){
					s += bar;
				}
			}
		}
		for(int k = 1; k < s.length(); k++){
			char a = s.charAt(k);
			char b = s.charAt(k - 1);
			if(a != b){
				s ="" + a;
			}
		}
		s = s + s.charAt(s.length());
		println(s); 
	}
}
