package lab3.Powers;

import lab3.Power;

public class HolyHeal extends Power {

	public HolyHeal(Power power) {
		super(power);
	}

	@Override
	public void Description() {
		System.out.println("Holy Heal, cura aliados proximos com o poder da luz!");
	}	
}
