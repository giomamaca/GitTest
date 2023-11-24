import acm.program.ConsoleProgram;

public class World extends ConsoleProgram{
	public void run(){
		String erti = readLine("1 : ");
		String ori = readLine("2 : ");
		println(possible(erti, ori));
	}
	
	private boolean possible(String erti, String ori){
		for(int i = 0; i < ori.length(); i++){
			char aso = ori.charAt(i);
			int index = erti.indexOf(aso);
			if(index == -1) return false;
			erti = erti.substring(index + 1, erti.length());
		}
		return true;
	}
	
	
	
}
