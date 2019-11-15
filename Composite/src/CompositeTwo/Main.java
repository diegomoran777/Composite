package CompositeTwo;

public class Main {

	public static void main(String[] args) {
		// Muchísimo mejor este approach, sólo faltó el builder!
		EnsaladaDeFruta ensaladaUno = new EnsaladaDeFruta();
		IFruta manzana = new Manzana();
		IFruta naranja = new Naranja();
		ensaladaUno.addFruta(manzana);
		ensaladaUno.addFruta(naranja);
		
		System.out.println("Nombre: " + ensaladaUno.getFruta(manzana).name());
		System.out.println("Sbaor: " + ensaladaUno.getFruta(manzana).sabor());
		System.out.println("Sbaor: " + ensaladaUno.getFruta(manzana).color());
		System.out.println("--------------");
		System.out.println("Nombre: " + ensaladaUno.getFruta(naranja).name());
		System.out.println("Sbaor: " + ensaladaUno.getFruta(naranja).sabor());
		System.out.println("Sbaor: " + ensaladaUno.getFruta(naranja).color());
	}

}
