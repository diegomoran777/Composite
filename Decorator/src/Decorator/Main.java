package Decorator;

public class Main {

	public static void main(String[] args) {
		IVehicle car = new VehicleHybrid(new Vehicle("pri"));
		car.Acelerate();
		car.Stop();
		car.Turn();
	}

}
