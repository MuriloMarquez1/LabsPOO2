package lab1.Attacks;

import lab1.Attack;

public class WeakAttack extends Attack {
	
	public WeakAttack() {
    	super(10);
    }

	@Override
	public void Attack() {
		System.out.println("Ataque fraco");
	}

}
