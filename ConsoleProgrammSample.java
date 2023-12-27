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
		HashSet<Integer> s =new HashSet<Integer>();
		int[] num = {1, 3, 7, 9, 1, 3, 4};
		for(int i : num){
			s.add(i);
		}
		println(s);
	}
}
