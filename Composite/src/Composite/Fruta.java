package Composite;

// Esto se asemeja más a lo que debería haber sido la interfaz IFruta
public class Fruta {
	private String sabor = "";
	private String color = "";
	private String caracteristica_principal = "";
	private String nombre = "";
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCaracteristica_principal() {
		return caracteristica_principal;
	}
	public void setCaracteristica_principal(String caracteristica_principal) {
		this.caracteristica_principal = caracteristica_principal;
	}
	
	
	
	
	
}
