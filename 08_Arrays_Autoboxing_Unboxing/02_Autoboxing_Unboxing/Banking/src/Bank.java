import java.util.ArrayList;

public class Bank {
	private String name; 
	private ArrayList<Branch> branches;
	
	public Bank(String name) {
		this.name = name; 
		branches = new ArrayList<Branch>(); 
	}
	
	public boolean addBranch(String branchName) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return false; 
		}
		
		return branches.add(new Branch(branchName)); 
	}
	
	public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
		Branch branch = findBranch(branchName); 
		if (branch == null) {
			return false; 
		}
		
		return branch.newCustomer(customerName, initialTransaction);
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount) {
		Branch branch = findBranch(branchName); 
		
		if (branch == null) {
			return false; 
		}
		
		// Add validation for transaction amount later on.
		
		return branch.addCustomerTransaction(customerName, transactionAmount); 
	}
	
	private Branch findBranch(String branchName) {
		for (Branch branch : branches) {
			if (branch.getName().equals(branchName)) {
				return branch;
			}
		}
		
		return null;
	}
	
	public boolean listCustomers(String branchName, boolean shouldPrintTransactions) {
		Branch branch = findBranch(branchName); 
		
		if (branch == null) {
			return false;
		}
		
		ArrayList<Customer> branchCustomers = branch.getCustomers();
		
		System.out.println("Customer details for branch " + branch.getName());
		
		for (Customer customer : branchCustomers) {
			System.out.println("Customer: " + customer.getName() + "[" + (branchCustomers.indexOf(customer) + 1) + "]");
			if (shouldPrintTransactions == true) {
				ArrayList<Double> customerTransactions = customer.getTransactions(); 
				System.out.println("Transactions");
				for (double transactionAmount : customerTransactions) {
					System.out.print("[" + (customerTransactions.indexOf(transactionAmount) + 1)+ "]  ");
					System.out.println("Amount " + transactionAmount);
				}
			}
		}
		
		return true;
	}
}
