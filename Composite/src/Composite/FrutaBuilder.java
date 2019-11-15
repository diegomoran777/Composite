package Composite;

// Esto parece estar bien encarado, va por el buen camino!
public abstract class FrutaBuilder {
	protected Fruta fruta;

	public Fruta getFruta() {
		return fruta;
	}

	// Lo ideal es crear la instancia automáticamente cuando se empieza a configurar un objeto
	public void createFruta() {
		this.fruta = new Fruta();
	}

	// Estos dos métodos no parecen tener sentido... en especial un setter que no recibe parámetros
	// Y un getter que no devuelve nada...
	// Lo mismo para los métodos "definir"
	public abstract void setName();
	public abstract void getName();
	public abstract void definir_sabor(); // No respetás la convención del código de dromedaryCase; acordate de poner
	// en práctica el mantener un estilo en el código
	public abstract void definir_color();
	public abstract void definir_caraccteristicas();
}
