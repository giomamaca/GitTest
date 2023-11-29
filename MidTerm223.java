import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;

public class MidTerm223 extends GraphicsProgram {

	private static final double SIZE = 50;

	private GRect r1 = null;
	private GRect r2 = null;

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
		if (obj == null)
			return;
		if (r1 == null && r2 == null) {
			r2 = obj;
			r2.setFilled(true);
			return;
		}
		if (r2 == null & r1 != null) {
			if (obj != null) {
				r1.setFilled(false);
			}
			r2 = r1;
			r1 = obj;
			r1.setFilled(true);
			return;
		}
		if (obj == r2) {
			r2.setFilled(false);
			r2 = null;
			return;
		}
		if (obj == r1) {
			r1.setFilled(false);
			r1 = r2;
			r2 = null;
			return;
		}
		r2.setFilled(false);
		r2 = r1;
		r1 = obj;
		r1.setFilled(true);
	}
}
