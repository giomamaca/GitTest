import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	public void run() {
		String[][] s = new String[3][4];
		for(int i = 0; i < s.length; i++){
			for(int j = 0; j < s[0].length; j++){
				s[i][j] = "a";
			}
		}
		println(s);
	}
}
