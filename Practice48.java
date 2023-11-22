import acm.program.ConsoleProgram;

public class Practice48 extends ConsoleProgram{
	public void run(){
		String str = readLine();
		char c = 'a';
		for(char ch = 0; ch  < 26; ch++){
			int num = countCharacter(str, ch);
			if(num > 0){
				println((char)('a' + ch) + ":" + num);				
			}
		}
	}

	private int countCharacter(String s, char c) {
		int count = 0;
		for(c = 'a'; c < s.length(); c++){
			int result = s.charAt(c);
			if(result == c){
				count++;
			}
		}
		return count;
	}
}
