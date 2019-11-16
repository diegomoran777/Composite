package Decorator;

public class PainoYamaha extends InstrumentDecorator{

	public PainoYamaha(IInstrument instrument) {
		super(instrument);
	}

	@Override
	public void Play() {
		getInstrument().Play();
		System.out.println("Versatility");
	}

}
