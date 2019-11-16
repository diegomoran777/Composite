package Decorator;

public class GuitarStratocaster extends InstrumentDecorator{

	public GuitarStratocaster(IInstrument instrument) {
		super(instrument);
	}

	@Override
	public void Play() {
		getInstrument().Play();
		System.out.println("sound Rocker");
	}
}
