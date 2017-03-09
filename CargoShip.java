
public class CargoShip extends Ship {
	int tonnage;		//holds the capacity of cargo
	/**
	 * no arg constructor
	 */
	public CargoShip() {
		this.name = "";
		this.tonnage = 0;
	}
	
	public CargoShip(String name, int tonnage) {
		this.name = name;
		this.tonnage = tonnage;
	}

	public CargoShip(int tonnage) {
		super();
		this.tonnage = tonnage;
	}

	public int getTonnage() {
		return tonnage;
	}
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	public String toString() {
		String str;
		str = "Cargo Ship Information\n***************\nName:\t\t\t" + name + 
				"\nCapacity:\t\t" + tonnage + " tons";
		return str;
	}
}
