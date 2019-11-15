package Composite;

// Por qué Manzana hereda de FrutaBuilder, si la Manzana es una Fruta, no un builder de frutas? Lo mismo con Naranja
public class Manzana extends FrutaBuilder {

	@Override
	public void definir_sabor() {
		fruta.setSabor("Dulce");
	}

	@Override
	public void definir_color() {
		fruta.setColor("Rojo");
	}

	@Override
	public void definir_caraccteristicas() {
		fruta.setCaracteristica_principal("Aspera");
	}

	@Override
	public void setName() {
		fruta.setNombre("Manzana");
	}

	@Override
	public void getName() { 
		fruta.getNombre();
	}

	
}
