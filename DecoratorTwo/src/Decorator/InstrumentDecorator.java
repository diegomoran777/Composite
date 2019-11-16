package Decorator;

public abstract class InstrumentDecorator implements IInstrument{
	
	private IInstrument instrument;
	
	public InstrumentDecorator(IInstrument instrument) {
		this.instrument = instrument;
	}
	
	protected IInstrument getInstrument() {
		return instrument;
	}
}
