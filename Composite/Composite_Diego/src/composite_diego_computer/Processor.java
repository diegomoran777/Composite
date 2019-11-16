package composite_diego_computer;

public class Processor extends BaseHardware{

	@Override
	public String name() {
		return "Procesador Intel core I7";
	}

	@Override
	public String model() {
		return "xj75";
	}

	@Override
	public String type() {
		return "7 nucleos";
	}

}
