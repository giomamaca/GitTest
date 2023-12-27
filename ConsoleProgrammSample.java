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
		String s = readLine();
		println(lengthOfLastWord(s));
	}
	public int lengthOfLastWord(String s) {
        StringTokenizer tk = new StringTokenizer(s, " ");
        ArrayList <String> list = new ArrayList <String>();

        while(tk.hasMoreTokens()){
            String str = tk.nextToken();
            list.add(str);
        }
        return list.get(list.size() - 1).length();
    }
}
