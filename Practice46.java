import acm.program.ConsoleProgram;

public class Practice46 extends ConsoleProgram{
	public void run(){
		String str = readLine();
		char chr = 'a';
		int max = 0;
		for(char c = 'a'; c <= 'z'; c++){
			int count = countCharacter(str, c);
			if(count > max){
				chr = c;
				max++;
			}
		}
		println(chr);
	}

	private int countCharacter(String str, char c) {
		int count = 0;
		int index = 0;
		while(index != -1){
			index =str.indexOf(c, index + 1);
		}
		return count - 1;
	}
}