package composite_diego_heladoVersion2;

import java.util.ArrayList;

public class ContainerQuarterKg extends Container{
	
	public ContainerQuarterKg() {
		super.iceCream = new ArrayList<>();
	}
	
	@Override
	public void addIceCream(IIceCream iceCream) {
		if(this.iceCream.size() < 3) {
			this.iceCream.add(iceCream);
		}
	}
	
	@Override
	public String showTastes() {
		if(!this.iceCream.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			sb.append("Contenido del cuarto:\n");
			for (IIceCream iIceCream : iceCream) {
				sb.append(iIceCream.toString() + "\n");
			}
			return sb.toString();
		}
		return NO_TASTES;
	}
}
