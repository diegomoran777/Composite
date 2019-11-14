package CompositeThree;

public class Manzana implements IFruta {

	@Override
	public String name() {
		return "Manzana";
	}

	@Override
	public String sabor() {		
		return "Dulce";
	}

	@Override
	public String color() {
		return "Rojo";
	}

	@Override
	public void removeFruta(IFruta fruta) {}

	@Override
	public IFruta getFruta(IFruta fruta) {
		return fruta;
	}

	@Override
	public void showFrutas() {}
	
	
	
}
