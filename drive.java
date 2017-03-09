
public class drive {
boolean carbelt;
int milesPerHour;
String carModel;
	public drive(boolean a, String b, int c) {
		this.carbelt = a;
		this.carModel = b;
		this.milesPerHour = c;
		if(carbelt){
			System.out.println("You floor your " + carModel + " going " + milesPerHour + " miles per hour!");
		} else {
			System.out.println("Put on your seatbelt!");
		}
	}

}
