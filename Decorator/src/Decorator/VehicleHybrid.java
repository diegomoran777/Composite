package Decorator;

public class VehicleHybrid extends DecloratorVehicle{

	public VehicleHybrid(IVehicle v) {
		super(v);
	}

	@Override
	public void Acelerate() {
		getVehicle().Acelerate();
		System.out.println("whitout fuel");
	}

	@Override
	public void Stop() {
		getVehicle().Stop();
		System.out.println("Breaks Hybrid");
	}

	@Override
	public void Turn() {
		getVehicle().Turn();
		System.out.println("Similar way");
	}

}
