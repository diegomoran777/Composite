package Strategy;

public class Player {
	
	private IPlay instrument;
	
	public Player(IPlay instrument){
		this.instrument = instrument;
	}

	public String InstrumentSound(){
		return this.instrument.Sound();
	}
	
	public String Instrument(){
		 return this.instrument.WhichIstrument();
	}
	
	public void setInstrument(IPlay instrument){
		this.instrument = instrument;
	}
	
	
}
