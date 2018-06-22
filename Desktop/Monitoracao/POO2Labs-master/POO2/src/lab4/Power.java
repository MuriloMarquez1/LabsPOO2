package lab4;

import java.util.ArrayList;
import java.util.Random;

public abstract class Power extends lab3.Power{
	
	private SkillType skillType;
	protected int damage;
	
	
	public Power(Power power) {
		super(power);
	}
	
	protected void setSkillType (SkillType skillType) {
		this.skillType = skillType;
	}
	
	public SkillType getSkillType() {
		return this.skillType;
	}
	
	public int getDamage() {
		return this.damage;
	}
	
//	public Power getPower() {
//		return this.
//	}
	
	public ArrayList<Power> getPowers() {
		ArrayList<Power> powers = new ArrayList<Power>();
//		powers.add(this.getPower());
//		powers.addAll(this.getPower().getPowers());
		return powers;
	}
	
	public Power choose() {
		if (this.getPower() == null)
			return (Power)this.getPower();
		Random generator = new Random();
		if (generator.nextFloat() < .5) {
			return ((Power) this.getPower()).choose();
		} else {
			return (Power)this.getPower();
		}
	}
}
