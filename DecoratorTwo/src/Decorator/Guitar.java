package Decorator;

public class Guitar implements IInstrument{
	
	private String type;
	
	public Guitar(String type) {
		this.type = type;
	}
	
	@Override
	public void Play() {
		System.out.println("Rasguear");	
	}
}
