import acm.program.ConsoleProgram;

public class Practice48 extends ConsoleProgram{
	public void run(){
		String str = readLine();
		char c = 'a';
		for(char chr = 'a'; chr < str.length(); chr++){
			int num = countCharacter(str, c);
			println(num);
			
		}
	}
	private int countCharacter(String str, char c){
		int count = 0;
		int index = 0;
		while(index != -1){
			count = str.indexOf(c, index +1);
			count++;
		}
		return count - 1;
	}
}
