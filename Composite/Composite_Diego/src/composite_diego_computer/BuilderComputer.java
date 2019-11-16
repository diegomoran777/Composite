package composite_diego_computer;

public class BuilderComputer {

	private Computer computer = new Computer();
	
	public BuilderComputer add(IHardware hardware) {
		this.computer.addHrdware(hardware);
		return this;
	}
	
	public Computer getComputer() {
		Computer d_computer = this.computer;
		this.computer = new Computer();
		return d_computer;
	}
}
