package Strategy;

public class Main {

	public static void main(String[] args) {
		Player diego = new Player(new Piano());
		System.out.println(diego.InstrumentSound());
		System.out.println(diego.Instrument());
		diego.setInstrument(new Guitarra());
		System.out.println(diego.InstrumentSound());
		System.out.println(diego.Instrument());
	}

}
