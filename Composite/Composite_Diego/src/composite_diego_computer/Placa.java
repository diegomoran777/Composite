package composite_diego_computer;

public class Placa extends BaseHardware{

	@Override
	public String name() {
		return "Placa GForce";
	}

	@Override
	public String model() {
		return "X765";
	}

	@Override
	public String type() {
		return "Video";
	}
	
}
