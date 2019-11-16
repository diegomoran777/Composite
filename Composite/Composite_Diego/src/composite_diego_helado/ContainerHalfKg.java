package composite_diego_helado;

import java.util.ArrayList;

public class ContainerHalfKg extends Container{
	
	public ContainerHalfKg() {
		super.iceCream = new ArrayList<>();
	}
	
	@Override
	public void addIceCream(IIceCream iceCream) {
		if(this.iceCream.size() < 5) {
			this.iceCream.add(iceCream);
		}
	}

	@Override
	public String showTastes() {
		if(!this.iceCream.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			sb.append("Contenido del medio kg:\n");
			for (IIceCream iIceCream : iceCream) {
				sb.append(iIceCream.toString() + "\n");
			}
			return sb.toString();
		}
		return NO_TASTES;
	}
	
}
