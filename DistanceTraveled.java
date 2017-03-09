
public class DistanceTraveled {
	private int speed;			//stores speed of vehicle
	private int timeTraveled = 1;	//stores time, in hours, travelled
	
	public DistanceTraveled() {
		
	}
	//getters and setters
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int s) {
		this.speed = s;
	}

	public int getTimeTraveled() {
		return timeTraveled;
	}

	public void setTimeTraveled(int t) {
		this.timeTraveled = t;
	}
	//distance = speed * time
	public int getDistance() {
		return speed * timeTraveled;
	}

}
