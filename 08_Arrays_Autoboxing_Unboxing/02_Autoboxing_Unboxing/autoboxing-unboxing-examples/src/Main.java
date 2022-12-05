import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String[] strArray = new String[10]; 
		int[] intArray = new int[10];
		
		ArrayList<String> strArrayList = new ArrayList<String>(); 
		strArrayList.add("Tim"); 
		
		// Autoboxing and Unboxing: Object wrapper for primitive classes.
		
		Integer integer = new Integer(45); 
		
		Double doubleValue = new Double(12.45); 
		
		// Use of method valueOf to convert a primitive value into a Wrapper. Unboxing is exactly the oposite of autboxing. Long Example.
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>(); 
		for (int i = 0; i <= 10; i++) {
			intArrayList.add(Integer.valueOf(i)); 
		}
		
		// Short way (built-in)
		Integer myIntValue = 56; // gets converted in runtime.
	}

}
