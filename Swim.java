
public class Swim {
boolean waterIsWarm;

	public Swim(boolean a) {
		this.waterIsWarm = a;
		if(waterIsWarm) {
			System.out.println("The water is warm, go for a swim!");
		} else {
			System.out.println("The water is cold, get out of the pool!");
		}
	}

}
