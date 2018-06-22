package lab10;

import lab5.Character;

public abstract class Energy {
	
	public Energy(Character character) {
		this.setAtributes(character);
	}
	
	public abstract void setAtributes(Character character);
}
