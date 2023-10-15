import acm.graphics.*;
import acm.program.*;

public class BuildHouse extends GraphicsProgram {
	
	private static final double HOUSE_HEIGHT = 200;
	private static final double HOUSE_WIDTH = 200;
	
	public void run (){
		drawHouse();
	}

	private void drawHouse() {
    	drawWall();
//		drawRoof();
//		drawDoor();
//		drawWindow();
	}

	private void drawWall() {
		GRect wall = new GRect (HOUSE_HEIGHT, HOUSE_WIDTH);
		double x = getWidth() - HOUSE_WIDTH;
		add(wall);
	}
}