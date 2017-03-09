/**
 * this class will use customer class and by extension person class
 * to input information into the fields and display onto console
 * @author Nathaniel
 *
 */
public class customerLauncher {
	
	public static void main(String[] args) {
		customer customer1 = new customer();
		customer1.setName("Nathaniel McFarland");
		customer1.setAddress("123 Palm ave\n\t\t\tSan Diego, Ca 92113");
		customer1.setPhoneNumber("314-702-3029");
		customer1.setCustomerNumber(324);
		customer1.setMailingList(false);
		System.out.print(customer1);

	}

}
