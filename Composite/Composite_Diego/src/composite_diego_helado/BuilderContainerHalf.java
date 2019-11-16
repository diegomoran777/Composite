package composite_diego_helado;

public class BuilderContainerHalf implements IBuilder{
	
	private ContainerHalfKg containerHalf = new ContainerHalfKg();

	@Override
	public void add(IIceCream iceCream) {
		this.containerHalf.addIceCream(iceCream);
	}
	
	@Override
	public ContainerHalfKg getContainer() {
		ContainerHalfKg contHalf = this.containerHalf;
		this.containerHalf = new ContainerHalfKg();
		return contHalf;
	}

}
