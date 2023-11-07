import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class exercise extends GraphicsProgram {
	
	private static final double BLOCK_WIDTH = 60;
	private static final double BLOCK_HEIGHT = 20;
	
	private int x = 1;
	private int y = 1;
	
	public void run() {
		GOval Ball = new GOval (0, getHeight() / 2, 18, 18);
		Ball.setFilled(true);
		add(Ball);
		for(int i = 0; i < 15; i++){
			GRect Block = new GRect (getWidth() / 2 - BLOCK_WIDTH / 2, 100, BLOCK_WIDTH, BLOCK_HEIGHT);
			Block.setFilled(true);
			Block.setColor(Color.red);
			add(Block);
		}
		
		while(true){
			Ball.move(x, y);
			Ball.pause(1);
			if(Ball.getX()== getWidth() - 18){
				x *= -1;
			}
			if(Ball.getY() == getHeight() - 18){
				y *= -1;
			}
			if(Ball.getX() == 0){
				x *= -1;					
			}
			if(Ball.getY() == 0){
				y *= -1;
			}
		}
	}
}
