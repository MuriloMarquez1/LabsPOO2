package lab7;

import lab2.Directions.*;
import lab5.Character;

public class JoyStick {
	
	Character characterControlled;
	
	public JoyStick(Character character) {
		this.characterControlled = character;
	}
	
	public void pressedUp() {
		this.characterControlled.Turn(new North());
	}
	
	public void pressedDown() {
		this.characterControlled.Turn(new South());
	}
	
	public void pressedLeft() {
		this.characterControlled.Turn(new West());
	}
	
	public void pressedRight() {
		this.characterControlled.Turn(new East());
	}
	
	public void pressedA() {
		this.characterControlled.attack();
	}
	
	public void pressedB() {
		this.characterControlled.jump();
	}
	
	public void pressedC() {
		this.characterControlled.run();
	}
}
