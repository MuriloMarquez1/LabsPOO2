package lab6.Factorys;

import lab1.Attacks.MediumAttack;
import lab1.Jumps.HighJump;
import lab1.Runs.MediumRun;
import lab4.Power;
import lab4.Shields.FireShield;
import lab5.Character;
import lab6.FuturisticCharacterFactory;
import lab6.Equipament.JetPack;
import lab6.Powers.EMP;

public class HackerFactory extends FuturisticCharacterFactory {
	public Character Create() {
		Character hacker = new Character();
		hacker.setSkills(new MediumAttack(), new HighJump(), new MediumRun());
	    Power emp = new EMP(null);
	    hacker.LearnPower(emp);
	    hacker.addProtection(new FireShield());
	    hacker.Equip(new JetPack());
	    System.out.println("Fabricado hacker");
	    return hacker;
	}
}
