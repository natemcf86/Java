
public class freezing {
private double temperature;				//variable to hold the temperature given
	public freezing() {
		
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double t) {
		this.temperature = t;
	}
	//boolean method to mark true if ethyl is freezing 
	public boolean isEthylFreezing() {
		if (temperature <= -173) {
			return true;
		} else {
			return false;
		}
	}
	//boolean method to mark true if ethyl is boiling
	public boolean isEthylBoiling() {
		if (temperature >= 172) {
			return true;
		} else {
			return false;
		}
	}
	//boolean method to mark true if oxygen is freezing 
	public boolean isOxygenFreezing() {
		if (temperature <= -362) {
			return true;
		} else {
			return false;
		}
	}
	//boolean method to mark true if oxygen is boiling
	public boolean isOxygenBoiling() {
		if (temperature >= -306) {
			return true;
		} else {
			return false;
		}
	}
	//boolean method to mark true if water is freezing 
	public boolean isWaterFreezing() {
		if (temperature <= 32) {
			return true;
		} else {
			return false;
		}
	}
	//boolean method to mark true if ethyl is boiling
	public boolean isWaterBoiling() {
		if (temperature >= 212) {
			return true;
		} else {
			return false;
		}
	}


}
