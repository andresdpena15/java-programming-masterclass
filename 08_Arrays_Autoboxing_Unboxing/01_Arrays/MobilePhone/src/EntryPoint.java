
public class EntryPoint {

	public static void main(String[] args) {
		MobilePhone myMobilePhone = new MobilePhone("123456");
		
		Contact c1 = new Contact("David", "456");
		Contact c2 = new Contact("Jennie", "345");
		Contact c3 = new Contact("Tom", "999");
		
		boolean first = myMobilePhone.addNewContact(c1);
		myMobilePhone.addNewContact(c2);
		myMobilePhone.addNewContact(c3);
		
		myMobilePhone.printContacts();
		
//		myMobilePhone.updateContact(c1, new Contact("Jack","900"));
//		myMobilePhone.printContacts();
		
		System.out.println(myMobilePhone.queryContact("David"));


	}

}
