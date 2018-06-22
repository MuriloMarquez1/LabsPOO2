package lab3;

public class Character extends lab2.Character {
	protected Power powers = null;
	
	public Character() {
		super();
	}
	
	public void LearnPower (Power power) {
		this.powers = power;
	}
	
	public void PowersDescriptions () {
		if (this.powers != null) {
			this.powers.Descriptions();
		} else {
			System.out.println("Eu sou noob, nao tenho poderes :(");
		}
	}
}
