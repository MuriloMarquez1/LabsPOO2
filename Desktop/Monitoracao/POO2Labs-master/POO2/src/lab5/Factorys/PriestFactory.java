package lab5.Factorys;

import lab1.Attacks.MediumAttack;
import lab1.Jumps.HighJump;
import lab1.Runs.MediumRun;
import lab5.Character;
import lab4.Power;
import lab4.Powers.HolyHeal;
import lab4.Shields.FireShield;
import lab5.MedievalCharacterFactory;
import lab5.Equipaments.Grimoary;
import lab5.Equipaments.ManaPotion;

public class PriestFactory extends MedievalCharacterFactory {
	@Override
	public Character Create() {
		Character priest = new Character();
		priest.setSkills(new MediumAttack(), new HighJump(), new MediumRun());
		Power holyHeal = new HolyHeal(null);
		priest.LearnPower(holyHeal);
		priest.addProtection(new FireShield());
		priest.Equip(new ManaPotion());
		priest.Equip(new Grimoary());
		System.out.println("Fabricado padre");
		return priest;
	}
}
