
public class problem16 {
//energy drink consumption
	public static void main(String[] args) {
		double TOTAL_CUSTOMERS = 15000;
		//find out amount of customers drink energy drinks weekly;
		double ENERGY_DRINK_CUSTOMERS = TOTAL_CUSTOMERS * .18;
		//find out amount of energy drink customers prefer citrus drinks;
		double CITRUS_DRINKERS = ENERGY_DRINK_CUSTOMERS * .58;
		//console output information;
		System.out.printf("There are %,.0f customers who drink one or more energy drinks per week"
				+ "\n%,.0f customers prefer citrius flavored energy drinks.", 
				ENERGY_DRINK_CUSTOMERS, CITRUS_DRINKERS);

	}

}
