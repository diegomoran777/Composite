package CompositeThree;

import java.util.ArrayList;

public class Composite implements IFruta {
	
	protected String nombre;
	protected ArrayList<IFruta> fruta = new ArrayList<IFruta>();
	
	public Composite() {
		
	}
	
	public void addFruta(IFruta fruta) {
		this.fruta.add(fruta);
	}
	
	@Override
	public void removeFruta(IFruta fruta) {
		for (IFruta Ifruta : this.fruta) {
			if(Ifruta.equals(fruta.name())) {
				fruta.removeFruta(Ifruta);
			}
		}
	}

	@Override
	public IFruta getFruta(IFruta fruta) {
		IFruta frutax = null;
		for (IFruta Ifruta : this.fruta) {
			if(Ifruta.name().equals(fruta.name())) {
				frutax = Ifruta;
			}
		}
		return frutax;
	}

	@Override
	public String name() {
		return nombre;
		}

	@Override
	public String sabor() {return "";}

	@Override
	public String color() {return "";}

	@Override
	public void showFrutas() {
		for (IFruta iFruta : fruta) {
			System.out.println("Nombre: " + iFruta.name());
			System.out.println("Sabor: " + iFruta.sabor());
			System.out.println("Color: " + iFruta.color());
		}
	}
	
	
	
}
