package composite_diego_helado;

public class Main {

	public static void main(String[] args) {
		
		BuilderContainerQuarterKg bowlQuarter = new BuilderContainerQuarterKg();
		bowlQuarter.add(new Frutilla());
		bowlQuarter.add(new Vainilla());
		System.out.println(bowlQuarter.getContainer().showTastes());
		
		BuilderContainerHalf bowlHalfKg = new BuilderContainerHalf();
		bowlHalfKg.add(new Frutilla());
		bowlHalfKg.add(new Vainilla());
		System.out.println(bowlHalfKg.getContainer().showTastes());
	}

}
