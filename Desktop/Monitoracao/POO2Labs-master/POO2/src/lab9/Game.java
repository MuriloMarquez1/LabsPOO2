package lab9;

import java.util.ArrayList;

public class Game {
	
	private ArrayList<Phase> phases = new ArrayList<Phase>();
	
	public Game() {
		this.phases.add(new Phase());
		this.phases.add(new Phase());
		this.phases.add(new Phase());
		for (Phase phase : phases) {
			phase.run();
		}
	}
}
