import acm.program.ConsoleProgram;

public class Practice46 extends ConsoleProgram{
	public void run(){
		String str = readLine();
		char answer = 'a';
		int Max = 0;
		for(char chr = 'a'; chr <= 'z' ; chr++){
			int count = countCharacter(str, chr);
			if(count > Max){
				Max = count;
				answer = chr;
			}
		}
		println(answer);
	}

	private int countCharacter(String str, char chr) {
		int count = 0;
		int index = 0;
		while(index != -1){
			index = str.indexOf(chr, index + 1);
			count++;
		}
		return count + 1;
	}
}
