import acm.program.ConsoleProgram;

public class Practice45 extends ConsoleProgram{
	public void run(){
		String str = readLine();
		String chr = readLine();
		if(chr.length() != 1){
			println("addada");
			return;
		}
		println(countChar(str, chr.charAt(0)));
	}

	private int countChar(String str, char charAt) {
		int charCount = 0;
		int lastIndex = -2;
		while(lastIndex != -1){
			lastIndex = str.indexOf(charAt, lastIndex + 1);
			charCount++;
		}
		return charCount - 1;
	}
}
