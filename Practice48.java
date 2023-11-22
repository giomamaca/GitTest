import acm.program.ConsoleProgram;

public class Practice48 extends ConsoleProgram{
	public void run(){
		String str = readLine();
		char c = 'a';
		for(char chr = 'a'; chr < 'z'; chr++){
			int num = countCharacter(str, c);
			println((char)('a' + chr) + ":" + num);
		}
	}

	private int countCharacter(String s, char c) {
		int count = 0;
		c = 'a';
		for(c = 'a'; c < s.length(); c++){
			int result = s.charAt(c);
			if(result == c){
				count++;
			}
		}
		return count - 1;
	}
}
