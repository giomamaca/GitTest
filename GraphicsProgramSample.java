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
	
	public GRect rect;
	
	public void run() {
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				double rectX = (double)(50 + i * SIZE);
				double rectY = (double)(50 + j * SIZE);
				rect = new GRect (rectX, rectY, SIZE, SIZE);
				add(rect);
			}
		}
		addMouseListeners();
	}



	public void mouseClicked(MouseEvent e){
		if(getElementAt(e.getX(), e.getY()) == rect){
			rect.setFilled(true);
			rect.setColor(Color.red);
		}
	}
}
