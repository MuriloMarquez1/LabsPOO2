package lab4;

import lab4.Character;
import lab2.Observer;
import lab2.Position;
import lab2.Directions.*;

public class Enemy extends Character implements Observer {
    private Character observed;
	
	public void Observer(Character character) {
		this.observed = character;
		character.addObserver(this);
	}
	
	@Override
	public void update() {
		System.out.println("Inimigo notificado\nAcao");
		double distance = Position.distancePositions(observed.getPosition(), this.getPosition());
		if ((int)distance <= 2) {
		   System.out.println("Atacar observado");
		   this.attack();
		   observed.attacked(this.attack.getValue(), this.ChoosePower());
		} else {
		   System.out.println("Andar para observado");
		   this.walkToPosition(observed.getPosition());
		}
	}
	
	private void walkToPosition (Position position) {
		if (position.getX() < this.getPosition().getX()) {
			this.position.setDirection(new South());
		}
		if (position.getX() > this.getPosition().getX()) {
			this.position.setDirection(new North());
		}
		if (position.getY() < this.getPosition().getY()) {
			this.position.setDirection(new East());
		}
		if (position.getY() > this.getPosition().getY()) {
			this.position.setDirection(new West());
		}
		this.run();
	}
	
	@Override
	public void run () {
		super.run();
		double distance = Position.distancePositions(observed.getPosition(), this.getPosition());
		this.position.goFoward(Math.min(this.run.getValue(),  (int)distance));
		this.notifyObserver();
	}
}
