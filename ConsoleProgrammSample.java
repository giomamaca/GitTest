import java.util.ArrayList;

import acm.graphics.GOval;
import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	public void run() {
		int k = readInt();
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		while(k != -1){
			list.add(k);
			k = readInt();
		}
		change(list);
		println(list.toString());
	}

	private void change(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) == 1) {
				list.add(1);
				i++;
			}
		}
	}
}
