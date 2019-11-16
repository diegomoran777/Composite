package composite_diego_helado;

public class Frutilla extends BaseIceCream{

	@Override
	public String type() {
		return "Frutilla a la crema";
	}

	@Override
	public String taste() {
		return "dulce";
	}

	@Override
	public String color() {
		return "Rosa";
	}

}
