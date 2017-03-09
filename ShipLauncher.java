
public class ShipLauncher {

	public static void main(String[] args) {
		//creates an array of ship references
		Ship[] ship = new Ship[3];
		//creates a new object in the array for ship
		ship[0] = new Ship("USS Chancellorsville", "1989");
		//creates a new object in the array for cruise ship
		ship[1] = new CruiseShip("Lets Party", 95);
		//creates a new object in the array for cargo ship
		ship[2] = new CargoShip("Lets Move", 205);
		for (int i = 0; i < ship.length; i++) {
			System.out.print(ship[i].toString() + "\n\n");
		}

	}

}
