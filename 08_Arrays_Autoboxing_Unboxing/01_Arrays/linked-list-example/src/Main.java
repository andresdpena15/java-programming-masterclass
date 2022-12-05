import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("Tim", 54.96); 
		
		//Customer and anotherCustomer are pointing to the same object.
		Customer anotherCustomer; 
		anotherCustomer = customer; 
		anotherCustomer.setBalance(12.18);
		
		ArrayList<Integer> intList = new ArrayList<Integer>(); 
		
		intList.add(1); 
		intList.add(3); 
		intList.add(4); 
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}
		
		intList.add(1, 2); 
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}
		
		//Comparison between Arrays and LinkedLists
		
		
		

	}

}
