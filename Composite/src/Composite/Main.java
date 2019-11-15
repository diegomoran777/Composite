package Composite;

public class Main {

	public static void main(String[] args) {
		// No se estilan nombres de variables empezando con mayuscula aun siendo nombres propios porque se confunde
		// con la convención de las clases, que empiezan con mayuscula.
		Granjero Juan = new Granjero();
		Juan.setFrutaBuilder( new Manzana());
		Juan.buildFruta();
	
		EnsaladaDeFruta ensalada1 =  new EnsaladaDeFruta();
		ensalada1.addFruta(Juan.getFrutaBuilder());
		
		Juan.setFrutaBuilder(new Naranja());
		Juan.buildFruta();
		
		ensalada1.addFruta(Juan.getFrutaBuilder());
		
		ensalada1.showFrutas();
	}

}
