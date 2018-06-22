package lab5.Factorys;

import lab1.Attacks.MediumAttack;
import lab1.Jumps.HighJump;
import lab1.Runs.MediumRun;
import lab5.Character;
import lab4.Power;
import lab4.Powers.Dash;
import lab4.Shields.FireShield;
import lab5.MedievalCharacterFactory;
import lab5.Equipaments.Bow;

public class HunterFactory extends MedievalCharacterFactory{

	@Override
	public Character Create() {
		Character hunter = new Character();
		hunter.setSkills(new MediumAttack(), new HighJump(), new MediumRun());
		Power dash = new Dash(null);
		hunter.LearnPower(dash);
		hunter.addProtection(new FireShield());
		hunter.Equip(new Bow());
		System.out.println("Fabricado cacador");
		return hunter;
	}

}
