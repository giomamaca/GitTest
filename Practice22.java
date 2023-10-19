import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Practice22 extends GraphicsProgram {
	private static final double NUM_CELLS = 8;
	public void run(){
		double length = math.min(getWidth(), getHeight()) / (double) NUM_CELLS;
		for(int i = 0 ; i < NUM_CELLS; i++){
			for(int j = 0; j < NUM_CELLS; j++){
				double x = i * length;
				double y = j * length; 
				double isFilled = (i + j) % 2 == 1;
				drawSquare(x, y, length, isFilled);
			}
		}
	}
	private void drawSquare(double x, double y, double lenght, boolean isFilled) {
		GRect square = new GRect(lenght, lenght);
		square.setFilled(isFilled);
		add(square, x, y);
	}
}
