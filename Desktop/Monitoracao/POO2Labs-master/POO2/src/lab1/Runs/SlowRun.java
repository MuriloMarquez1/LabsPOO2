package lab1.Runs;

import lab1.Run;

public class SlowRun extends Run{
	
	public SlowRun() {
    	super(1);
    }

	@Override
	public void Run() {
		System.out.println("Corrida lenta");
	}

}
