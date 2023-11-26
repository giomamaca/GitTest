import acm.program.ConsoleProgram;

public class MidTerm1614 extends ConsoleProgram{
	public void run(){
		String text = readLine();
		longestRunCompression(text);
		
	}
	private String longestRunCompression(String text){
		int count = 0;
		String S = "";
		char test = 'a';
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			test = ch;
			if(ch == test){
				count++;
				S = "" + count + test;
			}
			if(ch != test){
				count = 0;				
			}
		}
		return S;
	}
}
