
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import java.util.ArrayList;

import acm.graphics.GOval;
import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	public void run() {
		ArrayList <Integer> list = new ArrayList <Integer> ();
		
		}
		private void change(ArrayList <Integer> list){
		for(int i = 0; i < list.size() - 1; i++){
			if(list.get(i) == 1){
				list.add(i + 1 ,1);
			}
		}
	}
}
