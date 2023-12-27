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
		 final int[][] matrix = {
		         { 1, 2, 3 },
		         { 4, 5, 6 },
		         { 7, 8, 9 }
		      };
		      for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
		         for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
		            System.out.print(matrix[i][j] + " ");
		         }
		         System.out.println(); //change line on console as row comes to end in the matrix.
		      }
	}
}
