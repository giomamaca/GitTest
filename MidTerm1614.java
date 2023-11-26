import acm.program.ConsoleProgram;

public class MidTerm1614 extends ConsoleProgram{
	public void run(){
		String text = readLine();
		longestRunCompression(text);
		
	}
	private int longestRunCompression(String text){
		int count = 0;
		String S = "";
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			char chr = ch;
			if(ch == chr){
				count++;
				S = "" + count + chr;
			}
			if(ch != chr){
				count = 0;				
			}
		}
		return count;
	}
}
