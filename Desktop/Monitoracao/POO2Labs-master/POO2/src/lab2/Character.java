package lab2;

import java.util.ArrayList;

public class Character extends lab1.Character implements Observed {
	protected Position position;
	protected int lifePoints;
	private ArrayList<Observer> observers;
	
	public Character() {
		super();
		this.position = new Position();
		this.lifePoints = 100;
		this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void run () {
		super.run();
		this.position.goFoward(this.run.getValue());
		this.notifyObserver();
	}
	
	@Override
	public void jump () {
		super.jump();
	}
	
	@Override
	public void attack () {
		super.attack();
	}
	
	public void attacked (int damage) {
		System.out.println("Personagem recebe " + damage + " de dano");
		this.lifePoints -= damage;
		if (this.lifePoints <= 0) {
			System.out.println("Personagem morreu");
		}
	}
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : this.observers) {
			observer.update();
		}
	}
	
	public Position getPosition() {
		return this.position;
	}
}
