package lab1;

public class Character {
	protected Attack attack;
	protected Jump jump;
	protected Run run;
	
	public void setSkills(Attack attack, Jump jump, Run run) {
		this.attack = attack;
		this.jump = jump;
		this.run = run;
	}
	
	public void run () {
		if (this.run != null)
			this.run.Run();
	}
	
	public void jump () {
		if (this.jump != null)
			this.jump.Jump();
	}
	
	public void attack () {
		if (this.attack != null)
			this.attack.Attack();
	}
}
