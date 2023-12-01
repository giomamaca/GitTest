import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class GraphicsPractice extends GraphicsProgram {
	
	private static final double SIZE = 50;
	
	private GRect last;
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
		
		if(obj == last){
			last.setFilled(false);
			last = r2;
			r2 = null;
			return;
		}
		if(obj == r2){
			r2.setFilled(false);
			r2 = null;
			return;
		}
		if(r2 != null){
			r2.setFilled(false);
		}
		obj.setFilled(true);
		r2 = last;
		last = obj;
	}
}
