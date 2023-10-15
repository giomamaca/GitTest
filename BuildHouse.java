import acm.graphics.*;
import acm.program.*;

public class BuildHouse extends GraphicsProgram {
	
	private static final double HOUSE_HEIGHT = 200;
	private static final double HOUSE_WIDTH = 200;
	private static final double ROOF_HEIGHT = 60;
	
	public void run (){
		drawHouse();
	}

	private void drawHouse() {
    	drawWall();
		drawRoof1();
		drawRoof2();
		drawDoor();
		drawWindow();
	}

	private void drawWindow() {
		GRect window = new GRect (HOUSE_WIDTH / 4, HOUSE_HEIGHT / 5);
		double x5 = getWidth() / 1.9 - HOUSE_WIDTH / 2;
		double y5 = getHeight() - HOUSE_HEIGHT / 1.5;
		
		
		add(window, x5, y5);
	}

	private void drawDoor() {
		GRect door = new GRect (HOUSE_WIDTH  / 5, HOUSE_HEIGHT / 2);
		double x6 = getWidth() / 1.6 - HOUSE_WIDTH / 2;
		double y6 = getHeight() - HOUSE_HEIGHT / 2 ;
		
		add(door, x6, y6);
	}

	private void drawRoof2() {
		double x3 = getWidth() / 2 + HOUSE_WIDTH / 2;
		double y3 = getHeight() - HOUSE_HEIGHT;
		double x4 = x3 - HOUSE_HEIGHT / 2;
		double y4 = y3 - ROOF_HEIGHT;
		
		GLine line2 = new GLine (x3, y3, x4, y4);
		add(line2);
	}

	private void drawRoof1() {
		double x1 = getWidth() / 2 - HOUSE_WIDTH / 2;
		double y1 = getHeight() - HOUSE_HEIGHT;
		double x2 = x1 + HOUSE_HEIGHT / 2;
		double y2 = y1 - ROOF_HEIGHT;
		
		GLine line = new GLine (x1, y1, x2, y2);
		add(line);
	}

	private void drawWall() {
		GRect wall = new GRect (HOUSE_HEIGHT, HOUSE_WIDTH);
		double x = (getWidth() / 2 - HOUSE_WIDTH / 2);
		double y = getHeight() - HOUSE_HEIGHT;
		
		add(wall, x, y);
	}
}