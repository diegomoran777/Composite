package Composite;

public class Main {

	public static void main(String[] args) {
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
