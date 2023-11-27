import acm.program.ConsoleProgram;

public class MidTerm1614 extends ConsoleProgram{
	public void run(){
		String text = readLine();
		println(longestRunCompression(text));
		
	}
	private String longestRunCompression(String text){
		String str = "";
		int count = 1;
		int count1 = 1;
		int let = text.length();
		
		for(int i = 1; i < text.length(); i++){
			char ch = text.charAt(i);
			char chr = text.charAt(i - 1);
			char last = text.charAt(text.length() -1);
			if(ch == chr){
				count++;
			}
			if(ch != chr){
				String S = ("" + count) + chr;
				str += S;				
				let -= count;
				count = 1;	
			}
		}
//		for(int j = text.length(); j > 0; j++){
//			char ch = text.charAt(text.length() - j);
//	 		char chr = text.charAt(text.length() - (j - 1));
//	 		if(ch == chr){
//	 			count1++;
//	 		}
//	 		if(ch != chr) {
//	 			str = str + "" + count1 + chr;
//	 			break;
//	 		}
//		}
		return str;
	}
}
