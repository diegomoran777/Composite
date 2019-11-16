package Strategy;

public class Piano implements IPlay{

	@Override
	public String WhichIstrument() {
		return "piano";
	}

	@Override
	public String Sound() {
		return "plin";
	}
	
	
}
