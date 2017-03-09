
public class CarLauncher {
	public static void main(String[] args) {
		Car car1 = new Car(2017, "Lamborghini");
		for (int i=0; i < 5; i++){
			car1.accelerate();
		}
		for (int i=0; i < 5; i++){
			car1.brake();
		}
	}
	
}
