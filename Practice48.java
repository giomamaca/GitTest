import acm.program.ConsoleProgram;

public class Practice48 extends ConsoleProgram{
	public void run(){
		String str = readLine();
		for(int ch = 0; ch  < 26; ch++){
			char next = (char)('a' + ch);
			int num = countCharacter(str, next);
			if(num > 0){
				println(next + ":" + (double) num / str.length() * 100 + '%');			
			}
		}
	}

	private int countCharacter(String s, char c) {
		int count = 0;
		for(c = 0; c < s.length(); c++){
			int result = s.charAt(c);
			if(result == c){
				count++;
			}
		}
		return count;
	}
}
