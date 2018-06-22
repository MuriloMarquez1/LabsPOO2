package lab1.Attacks;

import lab1.Attack;

public class StrongAttack extends Attack{
	
	public StrongAttack() {
    	super(30);
    }
	
	@Override
	public void Attack() {
		System.out.println("Ataque forte");
	}
}
