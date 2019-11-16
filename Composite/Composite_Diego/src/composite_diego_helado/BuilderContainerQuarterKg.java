package composite_diego_helado;

public class BuilderContainerQuarterKg implements IBuilder{

	private ContainerQuarterKg containerQuarter = new ContainerQuarterKg();
	
	@Override
	public void add(IIceCream iceCream) {
		this.containerQuarter.addIceCream(iceCream);
	}
	
	@Override
	public ContainerQuarterKg getContainer() {
		ContainerQuarterKg contQuarter = this.containerQuarter;
		this.containerQuarter = new ContainerQuarterKg();
		return contQuarter;
	}
}
