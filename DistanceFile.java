
public class DistanceFile {
	private int speed;			//stores speed of vehicle
	private int timeTraveled = 1;	//counts hours traveled from 1 up until max time traveled given by user
	
	public DistanceFile() {
		
	}
	//getters and setters
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int s) {
		this.speed = s;
	}
	//returns the distance of the time travel
	public int getTimeTraveled() {
		return timeTraveled;
	}

	public void setTimeTraveled(int t) {
		this.timeTraveled = t;
	}
	//returns length of time traveled.
	public int getDistance() {
		return speed * timeTraveled;
	}

}
