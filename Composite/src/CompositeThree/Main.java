package CompositeThree;

public class Main {

	public static void main(String[] args) {
		// Esta implementación la veo como la anterior, pero agregando una clase más en el medio como
		// clase base de EnsaladaDeFruta, que no le veo mucho sentido...
		IFruta manzana = new Manzana();
		IFruta naranja = new Naranja();
		IFruta pera = new Pera();
		Composite ensaladaDeFruta = new EnsaladaDeFruta("Normal");
		ensaladaDeFruta.addFruta(manzana);
		ensaladaDeFruta.addFruta(naranja);
		
		ensaladaDeFruta.name();
		ensaladaDeFruta.showFrutas();
		System.out.println("--------------");
		
		Composite ensaladaCargada = new EnsaladaCargada("Cargada, mas frutas");
		ensaladaCargada.addFruta(pera);
		ensaladaCargada.addFruta(ensaladaDeFruta);
		ensaladaCargada.showFrutas();
	}

}
