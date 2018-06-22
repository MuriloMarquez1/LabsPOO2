package lab5.Factorys;

import lab1.Attacks.WeakAttack;
import lab1.Jumps.HighJump;
import lab1.Runs.SlowRun;
import lab5.Character;
import lab4.Power;
import lab4.Powers.MortalStrike;
import lab4.Shields.IceShield;
import lab5.MedievalCharacterFactory;
import lab5.Equipaments.Sword;

public class WarFactory extends MedievalCharacterFactory{

	@Override
	public Character Create() {
		Character war= new Character();
		war.setSkills(new WeakAttack(), new HighJump(), new SlowRun());
		Power MortalStrike = new MortalStrike(null);
		war.LearnPower(MortalStrike);
		war.addProtection(new IceShield());
		war.Equip(new Sword());
		System.out.println("Fabricado guerreiro");
		return war;
	}

}
