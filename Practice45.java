import acm.program.ConsoleProgram;

public class Practice45 extends ConsoleProgram{
	public void run(){
		String str = readLine();
		String chr = readLine();
		if(chr.length() != 1){
			println("wrong char");
			return;
		}
		println(countChar(str, chr.charAt(0)));
	}

	private int countChar(String str, char c) {
		int count = 0;
		int index = -2;
		while(index != -1){
			index = str.indexOf(c, index + 1);
			count++;
		}
		return count - 1;
	}
}
