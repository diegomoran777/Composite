package Decorator;

public class Main {

	public static void main(String[] args) {
		
		IInstrument instrument = new GuitarStratocaster(new Guitar("fender"));
		instrument.Play();
		instrument = new PainoYamaha(new Piano("yamaha de cola"));
		instrument.Play();
	}

}
