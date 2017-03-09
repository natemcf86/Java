
public class Temperature {
	private double ftemp;
	
	public Temperature(){
		
	}


	public double getFtemp() {
		return ftemp;
	}

	public void setFtemp(double frnht) {
		this.ftemp = frnht;
	}
	
	public double getCelsius() {
		return (5.0 / 9.0) * (ftemp - 32);
		
	}
	public double getKelvin() {
		return ((5.0 / 9.0) * (ftemp - 32)) + 273;
		
	}
}