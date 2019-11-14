package Composite;

import java.util.ArrayList;

public class EnsaladaDeFruta implements IFruta  {
	
	private ArrayList<FrutaBuilder> ensaladaDeFrutas = new ArrayList<FrutaBuilder>();
	
	@Override
	public void addFruta(FrutaBuilder fruta) {
		ensaladaDeFrutas.add(fruta);
	}

	@Override
	public void showFrutas() {
		for (FrutaBuilder fruta : ensaladaDeFrutas) {
			System.out.println("Fruta: " + fruta.getFruta().getNombre());
			System.out.println("Sabor: " + fruta.getFruta().getSabor());
			System.out.println("Color: " + fruta.getFruta().getColor() + "\n");
		}
	}
	
	

}
