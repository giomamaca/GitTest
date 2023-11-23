import acm.program.GraphicsProgram;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.graphics.*;
import acm.program.*;

public class MouseListener extends GraphicsProgram{
	
	private static final double SIZE = 100;
	
	private GRect rect;
	
	public void run(){
		for(int i = 0; i < 8; i++){
			rect = new GRect(getWidth() / 2 - SIZE / 2 + i * 100,getHeight()/ 2 - SIZE / 2 ,SIZE, SIZE);
			add(rect);			
		}
		addMouseListeners();
	}
	public void mouseClicked(MouseEvent e){
		if(getElementAt(e.getX(), e.getY()) == rect){
			rect.setFilled(true);
			rect.setColor(Color.red);
		}
	}
}
