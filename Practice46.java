import acm.program.ConsoleProgram;

public class Practice46 extends ConsoleProgram{
	public void run(){
		String s = readLine();
		println(more(s));
	}

	private char more(String s) {
		int count = 0;
		int max = count;
		
		char ch = 'a';
		
		for(int i = 0; i < s.length(); i++){
			char a = s.charAt(i);
			for(int j = i; j < s.length(); j++){
				char b = s.charAt(j);
				if(a == b){
					count++;
					if(max < count){
						max = count;
						ch = b;
					}
				}
				count = 0;
			}
		}
		return ch;
	}
}
