import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class MidTerm171 extends GraphicsProgram {

	private static final double SIZE = 100;

	private double X = getWidth() / 2 - SIZE / 2;
	private GRect rect;
	private GLabel num;
	private int k = 0;
	public double cen1 = getWidth() / 2 - SIZE / 2;
	public double cen2 = getHeight() / 2 - SIZE / 2;

	public void run() {
		addMouseListeners();

		GRect rect = new GRect(cen1, cen2, SIZE, SIZE);
//		num = new GLabel("da");
//		add(num, cen1 - num.getWidth() / 2, cen2 + num.getAscent() / 2);
		add(rect);

		System.out.println(k);
	}

//	public void mouseDragged(MouseEvent e) {
//		double x = e.getX();
//		double y = e.getY();
//
//		double moveX = x - SIZE / 2;
//		rect.setLocation(moveX, y - SIZE / 2);
//		if (k != 9) {
//			if ((rect.getX() + SIZE / 2) > X) {
//				k++;
//				X = rect.getX() + SIZE / 2;
//			}
//			if ((rect.getX() + SIZE / 2) < X) {
//				k--;
//				X = rect.getX() + SIZE / 2;
//			}
//		}
//	}
}
