package lab3;

public abstract class Power {
	private Power power;
	
	public Power(Power power) {
		this.power = power;
	}
	
	public Power getPower() {
		return this.power;
	}
	
	public abstract void Description ();
	
	public void Descriptions() {
		this.Description();
		if (this.power != null) {
		   this.power.Descriptions();
		}
	}
}
