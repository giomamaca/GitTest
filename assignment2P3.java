import acm.graphics.*;
import acm.program.GraphicsProgram;

public class assignment2P3 extends GraphicsProgram{
	private static final double RECT_WIDTH = 150;
	private static final double RECT_HEIGHT = 75;
	private static final double MIDLINE_WIDTH = 120;
	private static final double SPACE_BETWEENREC = 170;
	public void run(){
		double gW = getWidth();
		double gH = getHeight();
		
		GRect topRect = new GRect (RECT_WIDTH, RECT_HEIGHT);
		double x = gW / 2 - RECT_WIDTH / 2;
		double y = gH / 5;
	    add(topRect, x, y);
	    
	    GLabel topLabel = new GLabel ("Program");
	    double TL1 = topLabel.getWidth();
	    double TL2 = topLabel.getAscent();
	    add(topLabel, gW / 2 - TL1 /2, gH / 5 + RECT_HEIGHT / 2);
	    
	    GRect midRect = new GRect (RECT_WIDTH, RECT_HEIGHT);
	    double x1 = gW / 2 - RECT_WIDTH / 2;
	    double y1 = gH / 5 + MIDLINE_WIDTH;
	    add(midRect, x1, y1);
	    
	    GLabel midLabel = new GLabel ("ConsoleProgram");
	    double ML1 = midLabel.getWidth();
	    double ML2 = midLabel.getAscent();
	    add(midLabel, gW / 2 - RECT_WIDTH / 2 + ML1 / 4, gH / 5 + MIDLINE_WIDTH + RECT_HEIGHT / 2 );
	    
	    GRect leftRect = new GRect (RECT_WIDTH, RECT_HEIGHT);
	    double x2 = gW / 2 - RECT_WIDTH /2 - SPACE_BETWEENREC;
	    double y2 = gH / 5 + MIDLINE_WIDTH;
	    add(leftRect, x2, y2);
	    
	    GLabel leftLabel = new GLabel ("GraphicsProgram");
	    double LL1 = leftLabel.getWidth();
	    double LL2 = leftLabel.getAscent();
	    add(leftLabel, gW / 2 - RECT_WIDTH /2 - SPACE_BETWEENREC + LL1 /2, gH / 5 + MIDLINE_WIDTH + RECT_HEIGHT / 2);
	    
	    GRect rightRect = new GRect (RECT_WIDTH, RECT_HEIGHT);
	    double x3 = gW / 2 - RECT_WIDTH /2 + SPACE_BETWEENREC;
	    double y3 = gH / 5 + MIDLINE_WIDTH;
	    add(rightRect, x3, y3);
	    
	    GLabel rightLabel = new GLabel ("DialogProgram", gW / 2 - RECT_WIDTH /2 + SPACE_BETWEENREC, gH / 5 + MIDLINE_WIDTH + RECT_HEIGHT / 2);
	    add(rightLabel);
	    
	    double lx1 = gW / 2 ;
	    double ly1 = gH / 5 + RECT_HEIGHT;
	    double lx2 = gW / 2 ;
	    double ly2 = gH / 5 + MIDLINE_WIDTH;
	    GLine midLine = new GLine (lx1, ly1, lx2, ly2);
	    add(midLine);
	    
	    double lx3 = gW / 2 ;
	    double ly3 = gH / 5 + RECT_HEIGHT;
	    double lx4 = gW / 2 - SPACE_BETWEENREC;
	    double ly4 = gH / 5 + MIDLINE_WIDTH;
	    GLine leftLine = new GLine (lx3, ly3, lx4, ly4);
	    add(leftLine);
	    
	    double lx5 = gW / 2 ;
	    double ly5 = gH / 5 + RECT_HEIGHT;
	    double lx6 = gW / 2 + SPACE_BETWEENREC;
	    double ly6 = gH / 5 + MIDLINE_WIDTH;
	    GLine rightLine = new GLine (lx5, ly5, lx6, ly6);
	    add(rightLine);
	}
}
