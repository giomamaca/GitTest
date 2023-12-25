import java.util.ArrayList;
import java.util.HashMap;

import acm.graphics.GOval;
import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	public void run() {
		HashMap<String, String> map = new HashMap<String, String>();
		while(true){
			if(map.isEmpty()){
				break;
			}
			map.put("gio", "sofo");
		}
		println(map);
	}
}
