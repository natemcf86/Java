
public class RetailItemLauncher {

	public static void main(String[] args) {
		RetailItem[] item = new RetailItem[3];
		for (int i = 0; i < item.length; i++){
			item[i] = new RetailItem();
		}
		item[0].setDescription("Jacket");
		item[1].setDescription("Jeans");
		item[2].setDescription("Shirt");
		item[0].setUnitsOnHand(12);
		item[1].setUnitsOnHand(40);
		item[2].setUnitsOnHand(20);
		item[0].setPrice(59.95);
		item[1].setPrice(34.95);
		item[2].setPrice(24.95);
		System.out.print("Description\t\t\tUnits On Hand\t\tPrice\n");
		for (int i = 0; i<item.length; i++){
			int a = i +1;
			System.out.print("Item #" + a + "\t\t" + item[i].getDescription() 
					+ "\t\t" + item[i].getUnitsOnHand() + "\t\t\t"
					+ item[i].getPrice() + "\n");
		}

	}

}
