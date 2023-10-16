import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class BuildHouse extends GraphicsProgram {
	
	private static final double HOUSE_HEIGHT = 400;
	private static final double HOUSE_WIDTH = 200;
	private static final double ROOF_HEIGHT = 60;
	private Color yellow;
	
	public void run (){
		drawHouse();
	}

	private void drawHouse() {
    	drawWall();
		drawRoof1();
//		drawRoof2();
//		drawDoor();
//		drawWindow();
	}
	
	

	private void drawRoof1() {
		double x1 = getWidth() / 2 - 100;
		double y1 = getHeight() / 2;
	}

	private void drawWall() {
		GRect wall = new GRect (HOUSE_HEIGHT, HOUSE_WIDTH);
		double x = (getWidth() / 2 - 100);
		double y = getHeight() / 2;
		
		add(wall, x, y);
	}
}