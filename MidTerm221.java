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
			for(int i = 0; i < s.length(); i++){
				char a = s.charAt(i);
				for(int j = i; j < s.length(); j++){
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
			if(count > max){
				max = count;
			}
		}
	}
}
