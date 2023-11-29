
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

	public void run() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				double rectX = (double) (50 + i * SIZE);
				double rectY = (double) (50 + j * SIZE);
				GRect rect = new GRect(rectX, rectY, SIZE, SIZE);
				add(rect, rectX, rectY);
			}
		}
		addMouseListeners();

	}

	public void mouseClicked(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		
		
		GObject click = getElementAt(x, y);
		if (click != null) {
			((GRect) click).setFillColor(Color.BLACK);
			count++;
		}
	}
}
