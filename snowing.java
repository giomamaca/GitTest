import java.util.ArrayList;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class snowing extends GraphicsProgram{
	
	private RandomGenerator rg= RandomGenerator.getInstance();
	
	private static final double SNOW_SIZE = 30;
	
	private ArrayList<GOval> list = new ArrayList<GOval>();
	public void run(){
		while(true){
			makeSnow();
			moveSnow();
			
		}
	}
	private void moveSnow() {
		
	}
	private void makeSnow() {
		for(int i = 0; i < list.size(); i++){			
			if(rg.nextBoolean(0.05)){
				double x = rg.nextDouble(0, getWidth() - SNOW_SIZE);
				double y = rg.nextDouble(0, getHeight() - SNOW_SIZE);
				GOval snow = new GOval (SNOW_SIZE, SNOW_SIZE);
				snow.setFilled(true);
				add(snow);
			}
		}
	}
}
