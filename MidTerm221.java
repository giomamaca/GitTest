import acm.program.ConsoleProgram;

public class MidTerm221 extends ConsoleProgram{
	public void run(){
		while(true){
			String s = readLine();
			if(s.equals("END")){
				break;
			}
			
		}
	}
	private int countcharacter(String s){
		String result = "";
		for(int i = 0; i< s.length(); i++){
			if(!result.contains("" + s.charAt(i))){
				result += s.charAt(i);
			}
		}
		return result.length();
	}
}
