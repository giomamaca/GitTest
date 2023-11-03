/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class exercise extends GraphicsProgram {

//  Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

//  Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

//  Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
		public void run(){
//			for discribes how much much blocks should be put on vertikal
			for(int i = 0; i <= BRICKS_IN_BASE; i++){
//				This for adds one block on every other line
				for(int j = 0; j < 10; j++){
					addPiramid(i,j);
				}
			}
		}
		private void addPiramid(int i, int j) {
//			First on every other line blocks move left to make piramid
			GRect stairs = new GRect (j*BRICK_WIDTH + getWidth() / 2 - BRICK_WIDTH / 2 - i*(BRICK_WIDTH / 2), i*BRICK_HEIGHT + getHeight() - BRICKS_IN_BASE*BRICK_HEIGHT, BRICK_WIDTH, BRICK_HEIGHT);
			add(stairs);
		}
}
