package lab3.Powers;

import lab3.Power;

public class MortalStrike extends Power {

	public MortalStrike(Power power) {
		super(power);
	}

	@Override
	public void Description() {
		System.out.println("Mortal Strike, aplica um golpe poderoso causando dano alto");
	}

}
