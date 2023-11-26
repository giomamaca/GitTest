import acm.program.ConsoleProgram;

public class MidTerm1614 extends ConsoleProgram{
	public void run(){
		String text = readLine();
		longestRunCompression(text);
		
	}
	private String longestRunCompression(String text){
		int count = 0;
		String S = "";
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			char chr = text.charAt(text.length()/text.length() + i);
			if(ch == chr){
				count++;
			}
			if(ch != chr){
				S = ("" + count) + ch;
				count = 0;	
			}
		}
		return S;
	}
}
