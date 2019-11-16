package composite_diego_helado;

public abstract class BaseIceCream implements IIceCream{
	
	@Override
	public String toString() {	
		return "Sabor: " +  this.type() + " Gusto: " + this.taste() + " Color: " + this.color();
	}
	
}
