package CompositeTwo;

import java.util.ArrayList;

public class EnsaladaDeFruta implements IFruta {
	
	private ArrayList<IFruta> fruta = new ArrayList<IFruta>();
	
	public EnsaladaDeFruta() {
		
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
	public String name() {return "Ensalada de frutas";}

	@Override
	public String sabor() {return "Mixto";}

	@Override
	public String color() {return "Multicolor";}
	
}
