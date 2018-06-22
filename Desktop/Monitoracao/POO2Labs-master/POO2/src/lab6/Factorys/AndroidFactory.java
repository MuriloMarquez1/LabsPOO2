package lab6.Factorys;

import lab1.Attacks.MediumAttack;
import lab1.Jumps.HighJump;
import lab1.Runs.MediumRun;
import lab4.Power;
import lab6.Powers.SonicWave;
import lab4.Shields.FireShield;
import lab5.Character;
import lab6.FuturisticCharacterFactory;
import lab6.Equipament.PhotonSword;

public class AndroidFactory extends FuturisticCharacterFactory {
	
	public Character Create() {
		Character android = new Character();
	    android.setSkills(new MediumAttack(), new HighJump(), new MediumRun());
	    Power sonicWave = new SonicWave(null);
	    android.LearnPower(sonicWave);
	    android.addProtection(new FireShield());
	    android.Equip(new PhotonSword());
	    System.out.println("Fabricado android");
	    return android;
	}
}
