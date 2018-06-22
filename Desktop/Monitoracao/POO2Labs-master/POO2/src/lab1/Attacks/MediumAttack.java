package lab1.Attacks;

import lab1.Attack;

public class MediumAttack extends Attack{
	
    public MediumAttack() {
    	super(20);
    } 
	
	@Override
	public void Attack() {
		System.out.println("Ataque medio");
	}
}
