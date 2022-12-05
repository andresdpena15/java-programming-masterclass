import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<Customer> customers;
	
	public Branch(String name) {
		this.name = name;
		customers = new ArrayList<Customer>(); 
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	
	public boolean newCustomer(String customerName, double initialTransaction) {
		if (findCustomer(customerName) != null) {
			return false; 
		}
		
		return customers.add(new Customer(customerName, initialTransaction)); 
	}
	
	public boolean addCustomerTransaction(String customerName, double transactionAmount) {
		
		Customer customer = findCustomer(customerName);
		if (customer == null) {
			return false; 
		}
		
		customer.addTransaction(transactionAmount);
		return true;	
	}
	
	private Customer findCustomer(String customerName) {
		for (Customer customer : customers) {
			if (customer.getName().equals(customerName)) {
				return customer; 
			}
		}
		
		return null;
	}

}
