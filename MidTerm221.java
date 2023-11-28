import acm.program.ConsoleProgram;

public class MidTerm221 extends ConsoleProgram{
	public void run(){
		int count = 0;
		int max = count;
		while(true){
			String s = readLine();
			if(s == "END"){
				break;
			}
			if(count > max){
				max = count;
			}
			for(int i = 0; i < 256; i++){
				char a = s.charAt(i);
				for(int j = i; j < 256); j++){
					char b = s.charAt(j);
					if(a == b){
						return;
					}
					if(a != b){
						count++;
						println(s);
					}
				}
			}
		}
	}
}
