package lab1;

public abstract class Attack extends Attribute {
	
	public Attack(int n) {
		this.value = n;
	}
	
	public abstract void Attack();
}
