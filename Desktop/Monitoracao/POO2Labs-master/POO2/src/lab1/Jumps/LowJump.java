package lab1.Jumps;

import lab1.Jump;

public class LowJump extends Jump{
	
	public LowJump() {
    	super(1);
    }
	
	@Override
	public void Jump() {
		System.out.println("Pulo baixo");		
	}
}
