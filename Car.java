
public class Car {

	private int yearModel;
	private String make;
	private int speed;
	
	public Car(int year, String mk) {
		this.make = mk;
		this.yearModel = year;
		speed = 0;
	}
	
	public void accelerate() {
		speed += 5;
		System.out.println("You are now going " + this.speed + " mph.");
	}
	public void brake() {
		speed -= 5;
		System.out.println("You are now going " + this.speed + " mph.");
	}
	
	
	
}
