package lab5.Factorys;

import lab1.Attacks.MediumAttack;
import lab1.Jumps.HighJump;
import lab1.Runs.MediumRun;
import lab5.Character;
import lab4.Power;
import lab4.Powers.Dash;
import lab4.Shields.FireShield;
import lab5.MedievalCharacterFactory;
import lab5.Equipaments.Dagger;

public class RogueFactory extends MedievalCharacterFactory {
	@Override
	public Character Create() {
		Character rogue = new Character();
		rogue.setSkills(new MediumAttack(), new HighJump(), new MediumRun());
		Power dash = new Dash(null);
		rogue.LearnPower(dash);
		rogue.addProtection(new FireShield());
		rogue.Equip(new Dagger());
		System.out.println("Fabricado ladino");
		return rogue;
	}
}
