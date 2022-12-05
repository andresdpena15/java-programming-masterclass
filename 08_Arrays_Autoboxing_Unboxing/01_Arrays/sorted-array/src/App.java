import java.util.Scanner;

public class App {
	
	/*
	 * Beispiel nochmals überprüfen in Zukunft.
	 * 
	 * 
	 * Example: minimum element, not yet fully functional. 
	 */

	public static void main(String[] args) {
		/*
		 * Create a program using arrays that sorts a list of integers in descending order.

			Descending order is highest value to lowest.
			
			In other words if the array had the values in it [106, 26, 81, 5, 15] your program should ultimately have an array with [106, 81, 26, 15, 5] in it.
			
			Set up the program so that the numbers to sort are read in from the keyboard (Scanner).
			
			Implement the following methods: 
			
			getIntegers has one parameter of type int which is the size of the array. It returns an array of entered integers from the keyboard.
			
			printArray accepts an array and prints out the contents of the array. It should be printed in the following format:
			
			Element 0 contents 106
			Element 1 contents 81
			Element 2 contents 26
			Element 3 contents 15
			Element 4 contents 5
			
			sortIntegers accepts the unsorted array. It should sort the array and return a new array containing the sorted numbers.
			
			The scenario is:
			
			1. getIntegers() is called.
			
			2. The returned array from getIntegers() is then used to call sortIntegers().
			
			3. The returned array from sortIntegers() is then printed to the console.
			
			[Do not try and implement this. It is to give you an idea of how the methods will be used]
			
			TIP: you will have to figure out how to copy the array elements from the passed array into a new array and sort them and return the new sorted array.
			
			TIP: Instantiate (create) the Scanner object inside the method.
			
			TIP: Be extremely careful about spaces in the printed message.
			
			TIP: Make sure the Scanner class is imported.
			
			NOTE: All methods should be defined as public static NOT public.
			
			NOTE: Do not add a main method to the solution code.
		 */
		
		int[] sampleArray = getIntegers(5); 
		reverse(sampleArray); 
		
		
		

	}
	
	/*Reverse Array*/
	
	public static void reverse(int[] intArray) {
		
		class Inverse {
			void printArray(int[] array) {
				System.out.print("Array = [");
				for (int i = 0; i < array.length; i++) {
					if (i < array.length - 1) {
						System.out.print(array[i] + ", ");
					} else {
						System.out.print(array[i]);
					}
					
				}
				System.out.print("]");
			}
		}
		
		Inverse inverse = new Inverse(); 
		inverse.printArray(intArray);
		System.out.println();
		
//		int length = intArray.length;
//        for(int i = 0; i < (intArray.length-1)/2; i++) {
//            int temp = intArray[i];
//            intArray[i] = intArray[length-1-i];
//            intArray[length-1-i] = temp;
//        }
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 1; j < intArray.length - 1; j++) {
				if (intArray[i] > intArray[j]) {
					int temp = intArray[i];
					intArray[i] = intArray[j]; 
					intArray[j] = temp;
				}
			}
		}
		
		inverse.printArray(intArray); 
	}
	
	
	public static int readInteger() {
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		sc.close();
		
		return length; 
	}
	
	public static int[] readElements(int length) {
		
		Scanner sc = new Scanner(System.in); 
		
		int[] userIntegers = new int[length]; 
		
		for (int i = 0; i < userIntegers.length; i++) {
			String temp = sc.next();
			System.out.println(temp);
			
		}
		
		sc.close();
		
		return userIntegers; 
	}
	
	public static int findMin(int[] userIntegers) {
		for (int i = 0; i < userIntegers.length; i++) {
			for (int j = 0; i < userIntegers.length - 1; j++) {
				if (userIntegers[j] > userIntegers[j + 1]) {
					int temp = userIntegers[j + 1]; 
					userIntegers[j + 1] = userIntegers[j];
					userIntegers[j] = temp; 
				}
			}
		}
		
		return userIntegers[0]; 
	}
	
	// Ex. 1 
	
	public static int[] getIntegers(int size) {
		Scanner sc = new Scanner(System.in);
		
		int[] integerArray = new int[size]; 
		
		for (int i=0; i < size; i++) {
			integerArray[i] = sc.nextInt(); 
		}
		
		sc.close();
		
		return integerArray; 
	} 
	
	public static void printArray(int[] arrayToPrint) {
		for (int i = 0; i < arrayToPrint.length; i++) {
			System.out.println("Element " + i + " contents " + arrayToPrint[i]);
		}
	}
	
	public static int[] sortIntegers(int[] unsortedArray) {
		
		for(int i = 0; i < unsortedArray.length; i++) {
			for (int j = 1; j < unsortedArray.length; j++) {
				if (unsortedArray[j-1] < unsortedArray[j]) {
					int temp = unsortedArray[j - 1]; 
					unsortedArray[j - 1] = unsortedArray[j]; 
					unsortedArray[j] = temp; 
				}
			}
		}
		
		return unsortedArray; 
	}

}
