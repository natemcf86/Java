
public class RetailItemLauncher {

	public static void main(String[] args) throws NegativePrice, NegativeUnits{
		/*
		RetailItem[] item = new RetailItem[3];
		for (int i = 0; i < item.length; i++){
			item[i] = new RetailItem();
		}
		item[0].setDescription("Jacket");
		item[1].setDescription("Jeans");
		item[2].setDescription("Shirt");
		item[0].setUnitsOnHand(12);
		item[1].setUnitsOnHand(-20);
		item[2].setUnitsOnHand(20);
		item[0].setPrice(59.95);
		item[1].setPrice(34.95);
		item[2].setPrice(-30);
		*/
		/**
		 * create 3 new objects calling the different fields with the constructor
		 */
		RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
		RetailItem item2 = new RetailItem("Jeans", -20, 34.95);
		RetailItem item3 = new RetailItem("Shirt", 20, -30.00);
		/**
		 * outputs information if no errors
		 */
		System.out.print("Description\t\t\tUnits On Hand\t\tPrice\n"
				+ item1.getDescription() + "\t\t" + item1.getUnitsOnHand()
				+ "\t\t" + item1.getPrice() + "\n" + item2.getDescription() 
				+ "\t\t" + item2.getUnitsOnHand()	+ "\t\t" + 
				item2.getPrice() + "\n" + item1.getDescription() + "\t\t"
				+ item1.getUnitsOnHand() + "\t\t" + item1.getPrice() + "\n");
		

	}

}
