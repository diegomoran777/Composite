package Decorator;

public abstract class DecloratorVehicle implements IVehicle {
	
	private IVehicle vehicle;
	
	public DecloratorVehicle(IVehicle v) {
		this.vehicle = v;
	}
	
	protected IVehicle getVehicle() {
		return vehicle;
	}
}
