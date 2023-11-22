import acm.program.ConsoleProgram;

public class Practice48 extends ConsoleProgram{
	public void run(){
		String str = readLine();
		char c = 'a';
		for(int i = 0; i < 26; i++){
			int num = countCharacter(str, i);
			println((char)('a' + i) + ":" + num);
		}
	}

	private int countCharacter(String s, int i) {
		int count = 0;
		i = 'a';
		for(i = 'a'; i < s.length(); i++){
			int result = s.charAt(i);
			if(result == i){
				count++;
			}
		}
		return count - 1;
	}
}
