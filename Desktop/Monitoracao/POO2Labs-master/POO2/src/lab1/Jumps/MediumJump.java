package lab1.Jumps;

import lab1.Jump;

public class MediumJump extends Jump{
	
	public MediumJump() {
    	super(2);
    }
	
	@Override
	public void Jump() {
		System.out.println("Pulo medio");		
	}
}
