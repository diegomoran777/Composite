package composite_diego_computer;

public abstract class BaseHardware implements IHardware{
	
	@Override
	public String toString() {
		return "Nombre: " + this.name() + " Modelo: " + this.model() + " tipo: " + this.type();
	}
}
