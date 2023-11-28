
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

	private GRect rect;
	private int count = 0;
	private GRect rect1;
	private GRect rect2;

	public void run() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				double rectX = (double) (50 + i * SIZE);
				double rectY = (double) (50 + j * SIZE);
				rect = new GRect(rectX, rectY, SIZE, SIZE);
				rect.setFilled(true);
				rect.setFillColor(Color.WHITE);
				add(rect);
			}
		}
		addMouseListeners();
		
	}

	public void mouseClicked(MouseEvent e) {
		GObject click1 = getElementAt(e.getX(), e.getY());
		GObject click2 = getElementAt(e.getX(), e.getY());
		if (click1 != null || click2 != null) {
			if(true){
				((GRect) click1).setFillColor(Color.BLACK);
				count++;
				((GRect) click2).setFillColor(Color.BLACK);
				count++;
				rect1 = (GRect) click1;
			}
			if(count == 2){
				rect2 = (GRect) click2;
			}
			if(count > 2 && count % 2 == 1){
				rect1.setFillColor(Color.WHITE);
			}
			if(count >2 && count % 2 == 0){
				rect2.setFillColor(Color.white);
			}
		}
	}
}
