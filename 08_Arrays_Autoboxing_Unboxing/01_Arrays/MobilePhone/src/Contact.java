
public class Contact {
	private String name; 
	private String phoneNumber;
	
	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public static Contact createContact(String contactName, String phoneNumber) {
		return new Contact(contactName, phoneNumber); 
	}

}
