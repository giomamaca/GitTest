
/*
 * File: GraphicsHierarchy.java
 * ----------------------------
 * This program is a stub for the GraphicsHierarchy problem, which
 * draws a partial diagram of the acm.graphics hierarchy.
 */

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;

public class GraphicsProgramSample extends GraphicsProgram {

	private static final double SIZE = 50;

	private GRect r1 = null;
	private GRect r2 = null;
	private GRect r3 = null;

	public void run() {
		drawBoard();
		addMouseListeners();
	}

	private void drawBoard() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				double rectX = (double) (50 + i * SIZE);
				double rectY = (double) (50 + j * SIZE);
				GRect rect = new GRect(SIZE, SIZE);
				add(rect, rectX, rectY);
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();

		GRect obj = (GRect) getElementAt(x, y);
		if(obj != null){
			if(r1 == null){
				if(obj != null){
					r1 = obj;
					r1.setFilled(true);
				}
				return;
			}
			if(r1 != null && r2 == null){
				if(obj != null && obj != r1){
					r2 = obj;
					r2.setFilled(true);
				}
				return;
			}
			if(r1 != null && r2 != null){
				if(obj != null){
					r3 = obj;
					r3.setFilled(true);
				}
				r1.setFilled(false);
				r1 = null;
				return;
			}
			if(r2 != null && r3 != null){
				if(obj != null){
					r1 = obj;
					r1.setFilled(true);
				}
				r2.setFilled(false);
				r2 = null;
				return;
			}
			if(r3 != null && r1 != null){
				if(obj != null){
					r2 = obj;
					r2.setFilled(true);
				}
				r3.setFilled(false);
				r3 = null;
				return;
			}
		}
	}
}
