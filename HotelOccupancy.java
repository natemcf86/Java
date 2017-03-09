
public class HotelOccupancy {
	private double hotelFloors;		//stores amount of floors in a hotel
	private double hotelRooms = 0;			//stores amount of rooms in the hotel
	private double hotelOccupied = 0;		//stores amount of rooms are occupied on each floor
	public HotelOccupancy() {
		
	}
	/**
	 * returns total amount of floors for the hotel
	 * @return
	 */
	public double getHotelFloors() {
		return hotelFloors;
	}
	/**
	 * Sets the total amount of floors
	 * @param hf
	 */
	public void setHotelFloors(double hf) {
		this.hotelFloors = hf;
	}
	/**
	 * returns the total amount of rooms in the hotel
	 * @return
	 */
	public double getHotelRooms() {
		return hotelRooms;
	}
	/**
	 * stores the amount of room in the the hotel
	 * @param hr
	 */
	public void setHotelRooms(double hr) {
		this.hotelRooms = hr;
	}
	/**
	 * returns the amount of rooms occupied in the hotel
	 * @return
	 */
	public double getHotelOccupied() {
		return hotelOccupied;
	}
	/**
	 * stores the amount of rooms occupied in the hotel
	 * @param ho
	 */
	public void setHotelOccupied(double ho) {
		this.hotelOccupied = ho;
	}
	/**
	 * returns vacant rooms in the hotel
	 */
	public double gethotelVacancy() {
		return getHotelRooms() - getHotelOccupied();
	}
	/**
	 * returns occupancy rate calculated rooms occupied / total number of rooms
	 */
	public double getOccupancyRate() {
		return getHotelOccupied() / getHotelRooms();
	}
}
