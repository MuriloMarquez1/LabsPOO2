package lab4;

import java.util.ArrayList;

public class Character extends lab3.Character {
	protected ArrayList<ShieldSkill> shields;
	
	public Character() {
		super();
		this.shields = new ArrayList<ShieldSkill>();
	}
	
	public void addProtection(ShieldSkill shield) {
		this.shields.add(shield);
	}
	
	public void attacked (int damage, Power power) {
		boolean bloqued = false;
		for (ShieldSkill shield : shields) {
			if (shield.bloqued(power)) {
				System.out.println("Ataque bloqueado por " + shield.getClass().getSimpleName());
				bloqued = true;
				break;
			}
		}
		if (!bloqued) {
			super.attacked(damage);
		}
	}
	
	protected Power ChoosePower() {
		if (this.powers == null)
			return null;
		Power chosen = ((Power)this.powers).choose();
		return chosen;
	}
}
