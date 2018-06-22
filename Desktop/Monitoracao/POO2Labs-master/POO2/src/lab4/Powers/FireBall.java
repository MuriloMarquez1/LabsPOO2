package lab4.Powers;

import lab4.Power;
import lab4.SkillTypes.Fire;

public class FireBall extends Power{
	public FireBall(Power power) {
		super(power);
		this.setSkillType(new Fire());
	}

	@Override
	public void Description() {
		System.out.println("FireBall e a conjuracao uma esfera de fogo capaz de queimar seus inimigos");
	}
}
