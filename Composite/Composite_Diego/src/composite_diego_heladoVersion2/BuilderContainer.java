package composite_diego_heladoVersion2;

public class BuilderContainer extends BaseBuilderContainer{
	
	public void instantiateHalf() {
		super.containerHalf = new ContainerHalfKg();
	}
	
	public void instantiateQuarter() {
		super.containerQuarter = new ContainerQuarterKg();
	}

	@Override
	public void add(IIceCream iceCream) {
		if(this.containerHalf != null) {
			this.containerHalf.addIceCream(iceCream);
		}else {
			if(this.containerQuarter != null) {
				this.containerQuarter.addIceCream(iceCream);
			}
		}
	}
	
	@Override
	public IContainer getContainer() {
		IContainer container = null;
		if(this.containerHalf != null) {
			ContainerHalfKg contHalf = this.containerHalf;
			this.containerHalf = new ContainerHalfKg();
			container = contHalf;
		}
		if(this.containerQuarter != null) {
			ContainerQuarterKg contQuarter = this.containerQuarter;
			this.containerQuarter = new ContainerQuarterKg();
			container = contQuarter;
		}
		return container;
	}

}
