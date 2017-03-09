
public class Ship {
	String name;			//holds name of ship
	String yearBuilt;		//holds the year the ship was built
	/**
	 * no arg constructor
	 */
	public Ship() {
		this.name = "";
		this.yearBuilt = "";
	}
	/**
	 * constructor that requires fields
	 * @param name
	 * @param yearBuilt
	 */
	public Ship(String name, String yearBuilt) {
		super();
		this.name = name;
		this.yearBuilt = yearBuilt;
	}
	/**
	 * returns name of the ship
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * sets the namme of the ship
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * return the name of the year built
	 * @return
	 */
	public String getYearBuilt() {
		return yearBuilt;
	}
	/**
	 * set the name of the year built
	 * @return
	 */
	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	public String toString() {
		String str = "";
		str = "Ship Information\n***************\nName:\t\t\t" + 
				name + "\nYear:\t\t\t" + yearBuilt + "\n";
		return str;
	}
	
}
