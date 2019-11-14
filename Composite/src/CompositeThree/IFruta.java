package CompositeThree;

public interface IFruta {
	
	public String name();
	public String sabor();
	public String color();
	public void removeFruta(IFruta fruta);
	public IFruta getFruta(IFruta fruta);
	public void showFrutas();
}
