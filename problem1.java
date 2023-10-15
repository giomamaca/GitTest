import stanford.karel.SuperKarel;

public class problem1 extends SuperKarel{
	public void run(){
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
		fillLine();
		if(leftIsClear()){
			asvla1();
			}
		fillLine();
		if(rightIsClear()){
			asvla2();
		}
		}
	}

	private void asvla2() {
		turnRight();
		if(noBeepersPresent()){
			putBeeper();
		}
		move();
		if(noBeepersPresent()){
			putBeeper();
		}
		turnRight();
	}

	private void asvla1() {
		turnLeft();
		if(noBeepersPresent()){
			putBeeper();
		}
		move();
		if(noBeepersPresent()){
			putBeeper();
		}
		turnLeft();
	}

	private void fillLine() {
		while(frontIsClear()){
			move();
			if(noBeepersPresent()){
				putBeeper();
			}
		}
	}
}

