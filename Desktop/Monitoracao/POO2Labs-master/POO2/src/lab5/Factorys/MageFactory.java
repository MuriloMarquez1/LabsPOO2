package lab5.Factorys;

import lab1.Attacks.StrongAttack;
import lab1.Jumps.MediumJump;
import lab1.Runs.MediumRun;
import lab5.Character;
import lab4.Power;
import lab4.Powers.FireBall;
import lab4.Powers.IceLance;
import lab4.Shields.FireShield;
import lab4.Shields.IceShield;
import lab5.MedievalCharacterFactory;
import lab5.Equipaments.ManaPotion;

public class MageFactory extends MedievalCharacterFactory {

	@Override
	public Character Create() {
		Character mage = new Character();
		mage.setSkills(new StrongAttack(), new MediumJump(), new MediumRun());
		Power fireBall = new FireBall(null);
		Power iceLance = new IceLance(fireBall);
		mage.LearnPower(iceLance);
		mage.addProtection(new FireShield());
		mage.addProtection(new IceShield());
		mage.Equip(new ManaPotion());
		System.out.println("Fabricado mago");
		return mage;
	}
	
	
}
