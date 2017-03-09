import java.util.Scanner;
import java.text.DecimalFormat;

public class HotelOccupancyLauncher {

	public static void main(String[] args) {
		double roomsPerFloor;		//stores the rooms per floor
		double occupiedPerFloor;	//stores rooms occupied per floor
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#,###");
		DecimalFormat percent = new DecimalFormat("##%");
		HotelOccupancy hotel1 = new HotelOccupancy();
		System.out.print("\t\tHotel Occupancy\n");
		/**
		 * Gets the amount of floors in the hotel and if floors are less than 1 
		 * it creates an error.
		 */
		do {
			System.out.print("How many floors are in the hotel?");
			hotel1.setHotelFloors(keyboard.nextDouble());
			if (hotel1.getHotelFloors() < 1) {
				System.out.print("This is an invalid number. Please try again.\n");
			}
		} while (hotel1.getHotelFloors() < 1);
		/**
		 * Finds the amount of rooms on each floor and displays an error if 
		 * there are less than 10 rooms on each floor
		 */
		for (double i = 1; i <= hotel1.getHotelFloors(); i++) {
			if (i >= 2) {
				System.out.print("Currently on floor: " + formatter.format(i) + "\nNumber of "
						+ "rooms: " + formatter.format(hotel1.getHotelRooms()) + "\n"
						+ "Number of occupied rooms: " + formatter.format(hotel1.getHotelOccupied())
						+ "\n");
			}
			//loops if user puts a number less than 10 fortotal rooms on a floor
			do {
				System.out.print("How many rooms are on floor #" + formatter.format(i));
				roomsPerFloor = keyboard.nextDouble();
				keyboard.nextLine();
				if (roomsPerFloor < 10) {
					System.out.print("This is an invalid number. Please try again.\n");
					continue;
				}				
			} while (roomsPerFloor < 10);
			//adds rooms per floor to total rooms in hotel
			hotel1.setHotelRooms(hotel1.getHotelRooms() + roomsPerFloor);
			//finds how many rooms are occupied
			do {
				System.out.print("How many of those rooms are occupied?\n");
				occupiedPerFloor = keyboard.nextDouble();
				keyboard.nextLine();
				if (occupiedPerFloor > roomsPerFloor || occupiedPerFloor < 1) {
					System.out.print("This is an invalid number. Please try again.\n");
					continue;
				}
			} while (occupiedPerFloor > roomsPerFloor || occupiedPerFloor < 1);
			//adds rooms occupied to toal rooms occupied in hotel
			hotel1.setHotelOccupied(hotel1.getHotelOccupied() + occupiedPerFloor);
		}
		//displays total rooms, total rooms occupied, total rooms vacant, and occupancy rate
		System.out.print("\nNumbers of rooms:\t\t\t" + formatter.format(hotel1.getHotelRooms())
				+ "\nNumber of occupied rooms:\t\t" + formatter.format(hotel1.getHotelOccupied())
				+ "\nNumber of vacant rooms:\t\t\t" + formatter.format(hotel1.gethotelVacancy())
				+ "\nOccupancy Rate:\t\t\t\t" + percent.format(hotel1.getOccupancyRate()));
		
		
	}

}
