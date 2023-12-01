import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class GraphicsPractice extends GraphicsProgram {
	
	private static final double SIZE = 50;
	
	private GRect r1;
	private GRect r2;
	
	public void run(){
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
	public void mouseClicked(MouseEvent e){
		GRect obj = (GRect) getElementAt(e.getX(), e.getY());
		
		if(obj == null) return;
		
		if(r1 == null && r2 == null){
			r1 = (GRect) obj;
			r1.setFilled(true);
			return;
		}
		if(r1 == null && r2 != null){
			r1 = r2;
			r2 = obj;
			r2.setFilled(true);
			return;
		}
		if(obj == r1){
			r1.setFilled(false);
			r1 = null;
			return;
		}
		if(obj == r2){
			r2.setFilled(false);
			r2 = r1;
			r1 = obj;
			return;
		}
		r1.setFilled(false);
		r1 = r2;
		r2 = obj;
		r2.setFilled(true);
		
	}
}
