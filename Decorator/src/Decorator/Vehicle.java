package Decorator;

public class Vehicle implements IVehicle {
	
	private String name; 
	
    public Vehicle(String n) {
		this.name = n;
	}
	
	@Override
	public void Acelerate() {
		System.out.println("Go");
	}

	@Override
	public void Stop() {
		System.out.println("Stay");
	}

	@Override
	public void Turn() {
		System.out.println("Turn right, Turn left");
	}
	
}
