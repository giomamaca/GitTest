//კარელმა უნდა გამოაკლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n-m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს და ჩათვალეთ, რომ n>=m.

import stanford.karel.SuperKarel;

public class practice08 extends SuperKarel {
	public void run(){
		move();
		move();
		while(beepersPresent()){
			mouxvie1();
			if(beepersPresent()){
				mouxvie2();
			}
		}
		if(noBeepersPresent()){
			turnAround();
			move();
			while(beepersPresent()){
				aige();
			}
		}
		move();
		turnAround();
     }

	private void aige() {
		pickBeeper();
		turnAround();
		move();
		move();
		putBeeper();
		turnAround();
		move();
		move();
	}

	private void mouxvie2() {
		if(beepersPresent()){
			pickBeeper();
		}
		turnRight();
		move();
		putBeeper();
		turnAround();
		move();
		turnLeft();
		move();
	}
	
	private void mouxvie1() {
		if(beepersPresent()){
			pickBeeper();
			}
		turnLeft();
		move();
		putBeeper();
		turnAround();
		move();
		turnRight();
		move();
	}
}
