import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	
	public void run() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("gio", 2);
		map.put("sofo", 3);
		map.put("nino", 4);
		map.put("nika", 5);
		
		println(map.keySet());
	}
}
