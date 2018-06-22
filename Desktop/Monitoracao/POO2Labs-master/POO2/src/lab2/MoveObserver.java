package lab2;

import java.util.ArrayList;

public class MoveObserver implements Observed {
	
	private ArrayList<Observer> observeds = new ArrayList<Observer>();

	@Override
	public void addObserver(Observer observed) {
		observeds.add(observed);
	}

	@Override
	public void removeObserver(Observer observed) {
		observeds.remove(observed);
	}

	@Override
	public void notifyObserver() {
		for (Observer observed : observeds) {
		}
	}

}
