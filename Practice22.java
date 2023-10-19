import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Practice22 extends GraphicsProgram {
	private static final double NUM_CELLS = 8;
	public void run(){
		for(int i = 0 ; i < NUM_CELLS; i++){
			for(int j = 0; j < NUM_CELLS; j++){
				double x;
				double y; 
				double lenght;
				double isFilled;
				drawSquare(x, y, lenght, isFilled);
			}
		}
	}
	private void drawSquare() {
		
	}
}
