import stanford.karel.SuperKarel;

public class practice04 extends SuperKarel {
	public void run(){
		if(noBeepersPresent()){
			putBeeper();
		}
		while(frontIsClear()){
			while(frontIsClear()){
				move();
				if(noBeepersPresent()){
					putBeeper();
				}
			}
			if(frontIsBlocked()){
				turnLeft();
			}
			if(frontIsClear()){
				move();
			}
			if(noBeepersPresent()){
				putBeeper();
			}
			turnLeft();
			while(frontIsClear()){
				move();
				if(noBeepersPresent()){
					putBeeper();
				}
			}
			if(frontIsBlocked()){
				turnRight();
			}
			if(frontIsClear()){
				move();
			}
			if(noBeepersPresent()){
				putBeeper();
			}
			if(frontIsClear()){
				turnRight();
			}
		}
	}

}
