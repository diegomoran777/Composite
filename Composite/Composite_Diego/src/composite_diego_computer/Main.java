package composite_diego_computer;

public class Main {

	public static void main(String[] args) {
		
		BuilderComputer builderComputer = new BuilderComputer();
		builderComputer.add(new Placa()).add(new Processor());
		System.out.println(builderComputer.getComputer().showSpecifications());
		System.out.println(builderComputer.getComputer().showSpecifications());
	}

}
