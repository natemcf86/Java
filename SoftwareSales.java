
public class SoftwareSales {

	private double softwarePackage = 99;	//package cost is $99
	private double amountOfPackage; 		//holds amount of packages bought
	private double discount;				//discount depends on packages bought

	public SoftwareSales(double a) {
		this.amountOfPackage = a;
	}
	public double getamountOfPackage(){
		return amountOfPackage;
	}
	//finds discount depending on amountOfPackage
	public void setDiscount() {
		if (amountOfPackage >= 100) {
			discount = .5;
		} else if (amountOfPackage >= 50) {
			discount = .4;
		} else if (amountOfPackage >= 20) {
			discount = .3;
		} else if (amountOfPackage >= 10) {
			discount = .2;
		}
	}
	public double getDiscount(){
		return discount;
	}
	//find out total before discount is applied
	public double subTotal() {
		return softwarePackage * amountOfPackage;
	}
	//finds cost based on discount and amount of packages and package cost
	public double totalCost() {
		return (softwarePackage * amountOfPackage) * (1 - discount);
	}

}
