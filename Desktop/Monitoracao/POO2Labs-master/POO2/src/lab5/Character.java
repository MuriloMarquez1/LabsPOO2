package lab5;

import java.util.ArrayList;

import lab10.Energy;
import lab10.High;
import lab10.Low;
import lab10.Medium;
import lab2.Direction;
import lab4.Power;

public class Character extends lab4.Character {
	protected ArrayList<Equipament> equipaments = new ArrayList<Equipament>();
	
	public void Equip(Equipament equipament) {
		this.equipaments.add(equipament);
	}
	
	public void Turn(Direction direction) {
		System.out.println("Olhando para o " + direction.getClass().getSimpleName());
		this.position.setDirection(direction);
	}
	
private Energy energy = new High(this);
	
	public Character() {
		this.ConfigEnergy();
	}
	
	public void attacked (int damage, Power power) {
		super.attacked(damage, power);
		this.ConfigEnergy();
	}
	
	protected void ConfigEnergy() {
		if (this.lifePoints < 30) {
			System.out.println("Vida abaixo de 30%, nivel de energia baixo");
			this.setEnergy(new Low(this));
		}
		if (this.lifePoints < 70) {
			System.out.println("Vida abaixo de 70%, nivel de energia medio");
			this.setEnergy(new Medium(this));
		} else {
			System.out.println("Vida acima de 70%, nivel de energia alto");
			this.setEnergy(new High(this));
		}
	}
	
	protected void setEnergy(Energy energy) {
		this.energy = energy;
	}
}
