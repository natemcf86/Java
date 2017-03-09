
public class SpeedOfSound {
private double distance;			//length that sound will travel

	public SpeedOfSound() {
		// TODO Auto-generated constructor stub
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double d) {
		this.distance = d;
	}
	//returns time sound travels through air based on distance travelled
	public double getSpeedInAir() {
		return distance/1100;
	}
	//returns time sound travels through water based on distance travelled
	public double getSpeedInWater() {
		return distance/4900;
	}
	//returns time sound travels through steel based on distance travelled
	public double getSpeedInSteel() {
		return distance/16400;
	}

}
