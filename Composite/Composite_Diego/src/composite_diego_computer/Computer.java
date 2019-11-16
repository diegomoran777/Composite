package composite_diego_computer;

import java.util.ArrayList;

public class Computer {
	
	private ArrayList<IHardware> hardware = new ArrayList<IHardware>();
	static final String NO_INFORMATION = "No hay informacion del sistema";
	
	public void addHrdware(IHardware hardware) {
		this.hardware.add(hardware);
	}
	
	public String showSpecifications() {
		
		if(!this.hardware.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			sb.append("Informacion del sistema:\n");
			for (IHardware iHardware : hardware) {
				sb.append(iHardware.toString() + "\n");
			}
			return sb.toString();
		}
		return NO_INFORMATION;
	}
}
