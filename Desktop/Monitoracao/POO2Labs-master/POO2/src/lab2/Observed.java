package lab2;

public interface Observed {
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObserver();
}
