
public class MobileServiceProvider {
	private char packageLetter;				//stores letter of package
	private double minutes;						//stores minutes

	
	public MobileServiceProvider() {
		
	}
	public char getPackageLetter() {
		return packageLetter;
	}
	public void setPackageLetter(char pl) {
		this.packageLetter = pl;
	}
	public double getMinutes() {
		return minutes;
	}
	public void setMinutes(double m) {
		this.minutes = m;
	}
	public double packageA() {
		return 39.99 + ((minutes - 450) * .45);
	}
	public double packageB() {
		return 59.99 + ((minutes-900) * .40);
	}
	public double packageC() {
		return 69.99;
	}
	
	

}
