package Strategy;

public class Guitarra implements IPlay{

	@Override
	public String WhichIstrument() {
		return "Guitar";
	}

	@Override
	public String Sound() {
		return "prin";
	}

}
