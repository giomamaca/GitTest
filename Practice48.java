import acm.program.ConsoleProgram;

public class Practice48 extends ConsoleProgram{
	public void run(){
		String s = readLine("enter string : ");
		for(int c = 0; c < 26; c++){
			char chr = (char)('a' + c);
			int percent = countCharacter(s, chr);
			if(percent > 0){
				println(chr + ":" + (double)s.length() / percent * 100 + "%");
			}
		}
	}

	private int countCharacter(String s, char chr) {
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			int num = s.charAt(i);
			if(num == chr){
				count++;
			}
		}
		return count;
	}
}
