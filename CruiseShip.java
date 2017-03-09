
public class CruiseShip extends Ship {
	int passengers;		//holds number of passengers of the ship
	/**
	 * no arg constructor
	 */
	public CruiseShip() {
		this.name = "";
		this.passengers = 0;
	}
	/**
	 * constructor that sets the fields
	 * @param name
	 * @param passengers
	 */
	
	public CruiseShip(String name, int passengers) {
		this.name = name;
		this.passengers = passengers;
	}
	/**
	 * returns the amount of passengers of the ship
	 * @return
	 */
	public int getPassengers() {
		return passengers;
	}
	/**
	 * sets the 
	 * @param passengers
	 */
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	public String toString() {
		String str;
		str = "Cruise Ship Information\n***************\nName:\t\t\t" + 
				name + "\n# of Passengers:\t" + passengers + 
				" passengers";
		return str;
	}
}
