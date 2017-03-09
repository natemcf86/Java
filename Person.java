
public class Person {
private String name;			//holds name of person
private String address; 		//holds address of person
private String phoneNumber;		//holds phone number of person
/**
 * no arg constructor
 */
	public Person() {
		this.name = "";
		this.address = "";
		this.phoneNumber = "";
	}
	/**
	 * getters and setters to hold name, address, and phone number of person
	 * @return
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String toString() {
		String str = "";
		str = "Name:\t\t\t" + name + "\n\nAddress:\t\t" + address + "\n\nPhone Number:\t\t"
				+ phoneNumber + "\n\n";
		return str;
	}

}
