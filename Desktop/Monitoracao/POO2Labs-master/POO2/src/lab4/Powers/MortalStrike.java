package lab4.Powers;

import lab4.Power;
import lab4.SkillTypes.Physic;

public class MortalStrike extends Power{
	public MortalStrike(Power power) {
		super(power);
		this.setSkillType(new Physic());
	}

	@Override
	public void Description() {
		System.out.println("Mortal Strike, aplica um golpe poderoso causando dano alto");
	}
}
