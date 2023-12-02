import java.awt.event.MouseEvent;
import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class MidTerm193 extends GraphicsProgram {
	private final static int CIRCLE_D = 100;
	private final static int DELAY = 1000;
	private final static int N_COLORS = 5;
	RandomGenerator rgen = new RandomGenerator();
	
	private boolean flickering = false;
	
	private GOval currentOval;
	
	private GOval oval;
	private GObject obj = null;

	public void run() {
		addMouseListeners();
		while(true){
			if(flickering){
				flick();
			}
			pause(1);
		}
	}

	public void mouseClicked(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		
		GObject o = getElementAt(x, y);
		
		if(o == null){			
			oval = new GOval (x - CIRCLE_D / 2, y - CIRCLE_D / 2, CIRCLE_D, CIRCLE_D);
			oval.setFilled(true);
			oval.setColor(rgen.nextColor());
			add(oval);
		}
		if(o != null){
			obj = o;
			flickering = true;
			
		}
	}
	
	private void flick(){
		while(obj.getColor() != Color.GREEN){				
			obj.setColor(randomColor());
			pause(DELAY);
		}
		flickering = false;
		
	}

	private Color randomColor() {
		int a = rgen.nextInt(N_COLORS);
		if (a == 0) {
			return Color.GREEN;
		} else if (a == 1) {
			return Color.RED;
		} else if (a == 2) {
			return Color.BLUE;
		} else if (a == 3) {
			return Color.BLACK;
		}
			return Color.YELLOW;
	}
}