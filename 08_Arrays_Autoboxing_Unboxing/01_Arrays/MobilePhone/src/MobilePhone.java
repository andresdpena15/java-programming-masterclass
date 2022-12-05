import java.util.ArrayList;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contact> myContacts;
	
	public MobilePhone(String myNumber) {
		this.myNumber =  myNumber;
		myContacts = new ArrayList<>();
	}
	
	public boolean addNewContact(Contact newContact) {
		if (findContact(newContact) == -1) {
			myContacts.add(newContact);
			return true;
		}

		return false; 	
	}
	
	public boolean updateContact(Contact oldContact, Contact newContact) {
		int contactIndex = findContact(oldContact);
		
		if(contactIndex == -1) {
			return false; 
		}

		removeContact(oldContact);
		myContacts.add(contactIndex, newContact);
		return true;
	}
	
	public boolean removeContact(Contact myContact) {
		if (findContact(myContact) != -1) {
			return myContacts.remove(myContact);
		}

		return false; 
	}
	
	private int findContact(Contact myContact) {
		for (Contact contact: myContacts) {
			if (contact.getName().equals(myContact.getName())) {
				return myContacts.indexOf(contact); 
			}
		} 
		
		return -1; 
	}
	
	private int findContact(String contactName) {
		for (Contact contact: myContacts) {
			if (contact.getName().equals(contactName)) {
				return myContacts.indexOf(contact);
			}
		}
		
		return -1; 
	}
	
	public Contact queryContact(String contactName) {
		 return myContacts.get(findContact(contactName));  
	}
	
	public void printContacts() {
//		StringBuilder sb = new StringBuilder(); 
//		sb.append("Contact List: \n"); 
//		for (int i = 0; i < myContacts.size(); i++) {
//			Contact contact = myContacts.get(i);
//			int position = i + 1; 
//			sb.append(position + ". " + contact.getName() + " -> " + contact.getPhoneNumber() + "\n");
//		}
		
		System.out.println("Contact List:");

		for (int i = 0; i < myContacts.size(); i++) {
			Contact contact = myContacts.get(i);
			int position = i + 1; 
			System.out.println(position + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
		}
	}
}
