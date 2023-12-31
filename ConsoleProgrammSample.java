import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	public void run() {
		double a = Math.sqrt(12);
		println(a);
		println(mySqrt(a));
	}

	// Helper method to print a matrix of strings
	public int mySqrt(double a) {
		int n = 0;
		while((n * n) <= a) {
			n++;
		}
		return n;
	}
}
