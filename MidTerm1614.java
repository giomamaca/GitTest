import acm.program.ConsoleProgram;

public class MidTerm1614 extends ConsoleProgram{
	public void run(){
		String text = readLine();
		println(longestRunCompression(text));
		
	}
	private String longestRunCompression(String text){
		String str = "";
		int count = 1;
		int let = 0;
		for(int i = 1; i < text.length(); i++){
			char ch = text.charAt(i);
			char chr = text.charAt(i - 1);
			if(ch == chr){
				count++;
			}
			if(ch != chr){
				String S = ("" + count) + chr;
				str += S;				
				count = 1;	
			}
		}
		return str;
	}
}
