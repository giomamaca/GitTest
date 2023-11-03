import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class assignment2P2 extends GraphicsProgram {
	// Radius of large oval
	private static final double R1 = cmToPx(2.54);
	// Radius of medium oval
	private static final double R2 = cmToPx(1.65);
	// Radius of small oval
	private static final double R3 = cmToPx(0.76);

	private static double cmToPx(double d) {
		double cm = d * (72 / 2.54);

		return cm;
	}

	public void run() {
		// Create large oval
		GOval largeOval = new GOval(R1, R1);
		// X coordinate of large oval
		double x1 = getWidth() / 2 - 36;
		// Y coordinate of large oval
		double y1 = getHeight() / 2 - 36;
		// Set color on large oval
		largeOval.setFilled(true);
		largeOval.setColor(Color.RED);
		add(largeOval, x1, y1);

		// Create medium oval
		GOval medOval = new GOval(R2, R2);
		// X coordinate of medium oval
		double x2 = getWidth() / 2 - 24;
		// Y coordinate of medium oval
		double y2 = getHeight() / 2 - 24;
		// Set color on medium oval
		medOval.setFilled(true);
		medOval.setColor(Color.WHITE);
		add(medOval, x2, y2);

		// Create small oval
		GOval smallOval = new GOval(R3, R3);
		// X coordinate of small oval
		double x3 = getWidth() / 2 - 12;
		// Y coordinate of small oval
		double y3 = getHeight() / 2 - 12;
		// Set color on small oval
		smallOval.setFilled(true);
		smallOval.setColor(Color.RED);
		add(smallOval, x3, y3);
	}
}
