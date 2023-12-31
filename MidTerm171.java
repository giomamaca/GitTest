import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class MidTerm171 extends GraphicsProgram {

	private static final double SIZE = 100;

	private double X = getWidth() / 2 - SIZE / 2;
	private GRect rect;
	private GLabel num;
	private int k = 0;
	private double coordinate = 0;

	public void run() {
		addMouseListeners();

		rect = new GRect(getWidth() / 2 - SIZE / 2, getHeight() / 2 - SIZE / 2, SIZE, SIZE);
		num = new GLabel("0");
		add(num, getWidth() / 2 - num.getWidth() / 2, getHeight() / 2 + num.getAscent() / 2);
		add(rect);

	}

	public void mouseDragged(MouseEvent e) {
		double mouseX = e.getX();
		double mouseY = e.getY();

		double moveX = mouseX - SIZE / 2;
		if (e.getX() < rect.getX() || e.getX() > rect.getX() + SIZE || e.getY() < rect.getY()
				|| e.getY() > rect.getY() + SIZE)
			return;

		if (mouseX > coordinate && k < 9) {
			k++;
			num.setLabel("" + k);
		} else {
			if (mouseX < coordinate && k > 0)
				k--;
			num.setLabel("" + k);
		}
		coordinate = e.getX();

	}
}
