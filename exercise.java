import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class exercise extends GraphicsProgram {
	public void run(){
		int max = readInt();
		int min = max;
		if(max != 0){
			while(min != 0){
				int k = readInt();
				if(k != 0){
				if(k < min){
					min = k;
				}
				if(k > max){
					max = k;
				}
				}else break;
			}
		}
	}
}
