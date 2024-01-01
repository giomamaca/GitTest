import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.ConsoleProgram;

public class Practice68 extends ConsoleProgram{
	private JButton enter;
	private JTextField text;
	public void run(){
		text = new JTextField(10);
		add(text, SOUTH);
		enter = new JButton("enter");
		add(enter, SOUTH);
		text.addActionListener(this);
		addActionListeners();
	}
	public void ActionListener(ActionEvent e){
		if(text.getText().length() > 0){
			println(text.getText());
			text.setText("");
		}
	}
}
