package lab1.Jumps;

import lab1.Jump;

public class HighJump extends Jump{
	
	public HighJump() {
    	super(3);
    }
	
	@Override
	public void Jump() {
		System.out.println("Pulo alto");		
	}
}
