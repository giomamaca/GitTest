import acm.graphics.*;
import acm.program.GraphicsProgram;

public class assignment2P3 extends GraphicsProgram{
	private static final double RECT_WIDTH = 150;
	private static final double RECT_HEIGHT = 75;
	private static final double MIDLINE_WIDTH = 150;
	private static final double SPACE_BETWEENREC = 170;
	public void run(){
		GRect topRect = new GRect (RECT_WIDTH, RECT_HEIGHT);
		double x = getWidth() / 2 - RECT_WIDTH / 2;
		double y = getHeight() / 5;
	    add(topRect, x, y);
	    
	    GRect midRect = new GRect (RECT_WIDTH, RECT_HEIGHT);
	    double x1 = getWidth() / 2 - RECT_WIDTH / 2;
	    double y1 = getHeight() / 5 + MIDLINE_WIDTH;
	    add(midRect, x1, y1);
	    
	    GRect leftRect = new GRect (RECT_WIDTH, RECT_HEIGHT);
	    double x2 = getWidth() / 2 - RECT_WIDTH /2 - SPACE_BETWEENREC;
	    double y2 = getHeight() / 5 + MIDLINE_WIDTH;
	    add(leftRect, x2, y2);
	    
	    GRect rightRect = new GRect (RECT_WIDTH, RECT_HEIGHT);
	    double x3 = getWidth() / 2 - RECT_WIDTH /2 + SPACE_BETWEENREC;
	    double y3 = getHeight() / 5 + MIDLINE_WIDTH;
	    add(rightRect, x3, y3);
	    
	    double lx1 = getWidth() / 2 ;
	    double ly1 = getHeight() / 5 + RECT_HEIGHT;
	    double lx2 = getWidth() / 2 ;
	    double ly2 = getHeight() / 5 + MIDLINE_WIDTH;
	    GLine midLine = new GLine (lx1, ly1, lx2, ly2);
	    add(midLine);
	    
	    double lx3 = getWidth() / 2 ;
	    double ly3 = getHeight() / 5 + RECT_HEIGHT;
	    double lx4 = getWidth() / 2 - RECT_WIDTH /2 - SPACE_BETWEENREC + RECT_WIDTH / 2;
	    double ly4 = getHeight() / 5 + MIDLINE_WIDTH;
	    GLine leftLine = new GLine (lx3, ly3, lx4, ly4);
	    add(leftLine);
	}
}
