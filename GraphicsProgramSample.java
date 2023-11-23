/*
 * File: GraphicsHierarchy.java
 * ----------------------------
 * This program is a stub for the GraphicsHierarchy problem, which
 * draws a partial diagram of the acm.graphics hierarchy.
 */

import acm.graphics.*;
import acm.program.*;

public class GraphicsProgramSample extends GraphicsProgram {
	
	private GRect rect;
	private static final double SIZE = 50;
	
	public void run() {
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				rect = new GRect (SIZE,SIZE);
				add(rect);
			}
		}
	}

}
