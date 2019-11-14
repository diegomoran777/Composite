package Composite;

public class Naranja extends FrutaBuilder {

	@Override
	public void definir_sabor() {
		fruta.setSabor("Acido dulce");
	}

	@Override
	public void definir_color() {
		fruta.setColor("Naranja");
	}

	@Override
	public void definir_caraccteristicas() {
		fruta.setCaracteristica_principal("Acidez");
	}

	@Override
	public void setName() {
		fruta.setNombre("Naranja");	
	}

	@Override
	public void getName() {
		fruta.getNombre();
	}
	
}
