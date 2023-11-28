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
//		for(int i = 1; i < s.length(); i++){
//			char ch = s.charAt(i);
//			char chr = s.charAt(i - 1);
//			if(ch != chr){
//				String S ="" + chr;
//				s += S;
//			}
//		}
//		char last = s.charAt(s.length() -1);
//		s = s + "" + last;
		println(s); 
	}
}
