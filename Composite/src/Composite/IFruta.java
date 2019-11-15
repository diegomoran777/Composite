package Composite;

// Me parece que acá hay un error conceptual grande... por qué una IFruta recibiría Builders?
// Lo más lógico sería que IFruta sea la interfaz común para todas las frutas, y que luego Manzana, Naranja, etc.,
// la implementen.
public interface IFruta {
	
	public void addFruta(FrutaBuilder fruta);
	
	public void showFrutas();
}
