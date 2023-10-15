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
		drawRoof();
//		drawDoor();
//		drawWindow();
	}

	private void drawRoof() {
		double x1 = (getWidth() / 2 - HOUSE_WIDTH / 2);
		double y1 = getHeight() - HOUSE_HEIGHT;
		double x2 = x1 + HOUSE_HEIGHT / 2;
		double y2 = y1;
		
		GLine line = new Gline (x1, y1, x2, y2);
		add(line);
	}

	private void drawWall() {
		GRect wall = new GRect (HOUSE_HEIGHT, HOUSE_WIDTH);
		double x = (getWidth() / 2 - HOUSE_WIDTH / 2);
		double y = getHeight() - HOUSE_HEIGHT;
		
		add(wall, x, y);
	}
}