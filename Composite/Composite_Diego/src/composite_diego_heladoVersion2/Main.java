package composite_diego_heladoVersion2;

public class Main {

	public static void main(String[] args) {
		
		BuilderContainer builderContHallf = new BuilderContainer();
		builderContHallf.instantiateHalf();
		builderContHallf.add(new Frutilla());
		builderContHallf.add(new Vainilla());
		System.out.println(builderContHallf.getContainer().showTastes());
		
		BuilderContainer builderContQuarter = new BuilderContainer();
		builderContQuarter.instantiateQuarter();
		builderContQuarter.add(new Frutilla());
		builderContQuarter.add(new Vainilla());
		System.out.println(builderContQuarter.getContainer().showTastes());
		
	}

}
