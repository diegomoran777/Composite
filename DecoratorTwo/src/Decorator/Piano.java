package Decorator;

public class Piano implements IInstrument{
	
	private String Type;

	public Piano(String type) {
		this.Type = type;
	}
	
	@Override
	public void Play() {
		System.out.println("Teclear");
	}
	
}
