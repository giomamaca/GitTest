import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GOval;
import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	
	private JTextField text;
	private JButton but;
	
	public void run() {
		JLabel lab = new JLabel("text: ");
		add(lab, SOUTH);
		text = new JTextField(10);
		add(text, SOUTH);
		but = new JButton("ender");
		add(but, SOUTH);
		
	}

	private void actionPerformed(ActionEvent e) {
		
	}
}
