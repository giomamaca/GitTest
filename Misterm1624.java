import acm.program.ConsoleProgram;

public class Misterm1624 extends ConsoleProgram{
	public void run(){
		String text = readLine();
		println(unEvilText(text));
	}
	private String unEvilText(String text){
		String answer ="" + text.charAt(0);
		
		for(int i = 1; i < text.length(); i++){
			char a = text.charAt(i);
			char b = text.charAt(i - 1);
			
			if(a != b){
				answer += a;
			}
		}
		return answer;
	}
}
