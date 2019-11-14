package CompositeThree;

public class Pera implements IFruta{

	@Override
	public String name() {
		return "Pera";
	}

	@Override
	public String sabor() {
		return "Dulce";
	}

	@Override
	public String color() {
		return "Verde";
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
