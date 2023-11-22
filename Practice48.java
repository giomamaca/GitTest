import acm.program.ConsoleProgram;

public class Practice48 extends ConsoleProgram{
	public void run(){
		String str = readLine();
		metod(str);
	}
	private void metod(String str) {
		for(int ch = 0; ch  < 26; ch++){
			char c = (char)('a' + ch);
			int num = countCharacter(str, c);
			if(num > 0){
				println(c + ":" + (double) (num / str.length()) * 100 + '%');			
			}
		}
	}
	private int countCharacter(String s, char c) {
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			int result = s.charAt(i);
			if(result == c){
				count++;
			}
		}
		return count;
	}
}
