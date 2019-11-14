package Composite;

public class Granjero {
	private FrutaBuilder frutaBuilder;

	public FrutaBuilder getFrutaBuilder() {
		return frutaBuilder;
	}

	public void setFrutaBuilder(FrutaBuilder frutaBuilder) {
		this.frutaBuilder = frutaBuilder;
	}
	
	public void buildFruta() {
		frutaBuilder.createFruta();
		frutaBuilder.definir_sabor();
		frutaBuilder.definir_color();
		frutaBuilder.definir_caraccteristicas();
		frutaBuilder.setName();
	}
	
	
}
