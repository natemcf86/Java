/**
 * This will use an object from preferred customer and in extension customer
 * and person. It'll find the person's discount based on the purchased amount 
 * and give the total.
 * @author Nathaniel
 *
 */
public class PreferredCustomerLauncher {

	public static void main(String[] args) {
		PreferredCustomer customer1 = new PreferredCustomer();
		customer1.setName("Nathaniel McFarland");
		customer1.setAddress("123 Palm ave\n\t\t\tSan Diego, Ca 92113");
		customer1.setPhoneNumber("314-702-3029");
		customer1.setCustomerNumber(324);
		customer1.setMailingList(false);
		customer1.setCustomerPurchase(1570.52);
		customer1.setDiscount();
		System.out.print(customer1);
	}
}
