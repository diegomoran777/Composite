package Composite;

public abstract class FrutaBuilder {
	protected Fruta fruta;

	public Fruta getFruta() {
		return fruta;
	}

	public void createFruta() {
		this.fruta = new Fruta();
	}
	
	public abstract void setName();
	public abstract void getName();
	public abstract void definir_sabor();
	public abstract void definir_color();
	public abstract void definir_caraccteristicas();
}
