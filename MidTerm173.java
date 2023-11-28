import acm.program.ConsoleProgram;

public class MidTerm173 extends ConsoleProgram{
	public void run(){
		String gamarjoba = readLine();
		String baro = readLine();
		
		for(int i = 0; i< baro.length(); i++){
			int k = 0;
			char bar = baro.charAt(i);
			if(gamarjoba.contains(baro)){
				println("correct");
				k++;
				if(k == baro.length()){
					println(baro);
				}
			}
		}
		
	}
}
