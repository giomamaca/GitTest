import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GOval;
import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	
	private JTextField text;
	private JButton but;
	
	public void run() {
		text = new JTextField(100);
		add(text, SOUTH);
	}
}
