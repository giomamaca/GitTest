import stanford.karel.SuperKarel;

public class Practice07 extends SuperKarel{
	public void run(){
		while(frontIsClear()){
			Sheavse();
			if(leftIsClear()){
				mouxvie1();
			}
			Sheavse();
			if(rightIsClear()){
				mouxvie2();
			}
		}
	}

	private void mouxvie2() {
		turnRight();
		move();
		turnRight();
	}

	private void mouxvie1() {
		turnLeft();
		move();
		turnLeft();
	}

	private void Sheavse() {
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			if(frontIsClear()){
				move();
			}
			if(frontIsClear()){
				move();
			}
		}
	}
}