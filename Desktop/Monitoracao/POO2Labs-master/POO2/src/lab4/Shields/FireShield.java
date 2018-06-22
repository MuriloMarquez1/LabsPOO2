package lab4.Shields;

import lab4.ShieldSkill;
import lab4.SkillTypes.Fire;

public class FireShield extends ShieldSkill {

	public FireShield() {
		this.triggers.add(new Fire());
	}
}
