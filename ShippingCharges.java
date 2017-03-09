
public class ShippingCharges {
	private double packageWeight;		//stores weight of package
	private double miles;				//stores how far package will be delivered
	private double charges;				//stores charges based on how far it'll go and how much it weighs
	private double milesCharges;		//stores amount of charges based on miles
	public ShippingCharges() {	
		
	}
	
	public double getPackageWeight() {
		return packageWeight;
	}
	public void setPackageWeight(double a) {
		this.packageWeight = a;
	}
	public double getMiles() {
		return miles;
	}
	public void setMiles(double b){
		this.miles = b;
	}
	public double getCharges() {
		return charges;
	}
	//finds charges based on packageWeight. The bigger the package, the higher the cost.
	public void setCharges() {
		if (packageWeight > 10){
			charges = 4.80;
		} else if (packageWeight > 6){
			charges = 3.70;
		} else if (packageWeight > 2){
			charges = 2.20;
		} else {
			charges = 1.10;
		}
	}
	//finds shipping charges by every 500 miles that isn't prorated.If miles are less than 500, charges will be regular price.
	public double getShippingCharges() {
		return (Math.ceil(miles / 500) * charges);
	}
	

}
