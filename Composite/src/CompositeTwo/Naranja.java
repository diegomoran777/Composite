package CompositeTwo;

public class Naranja implements IFruta  {

	@Override
	public String name() {
	  return "Naranja";
	}

	@Override
	public String sabor() {
		return "Dulce acido";
	}

	@Override
	public String color() {
		return "Naranja";
	}

	@Override
	public void removeFruta(IFruta fruta) {}

	@Override
	public IFruta getFruta(IFruta fruta) {
		return fruta;
	}
	
}
