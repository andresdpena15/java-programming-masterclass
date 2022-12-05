import java.util.Arrays;
import java.util.Collections;

public class SolutionReverseArray {
	
	/* 
	 * Here are three different ways to reverse an array in Java
	 */
	
	/* 
	 * Using an ArrayList
	 */
	
	//Using list and corresponding method.
	
	public static void reverse1(int[] intArray) {
		Collections.reverse(Arrays.asList(intArray)); 
		System.out.println("Reversed array: " + Arrays.asList(intArray));
	}
	
	public static void reverseArray(int intArray[], int size) 
    { 
        int i, k, temp; 
        for (i = 0; i < size / 2; i++) { 
            temp = intArray[i]; 
            intArray[i] = intArray[size - i - 1]; 
            intArray[size - i - 1] = temp; 
        } 
 
        /*print the reversed array*/
       System.out.println("Reversed Array: \n" + Arrays.toString(intArray)); 
    } 
	
//	public static void reverse2(char char_array, int n) {
//		char[] dest_array = new char[n]; 
//	       int j = n; 
//	       for (int i = 0; i < n; i++) { 
//	            dest_array[j - 1] = char_array[i]; 
//	            j = j - 1; 
//	        } 
//	 
//        System.out.println("Reversed array: "); 
//        for (int k = 0; k < n; k++) { 
//           System.out.print(dest_array[k] + " "); 
//        }
//	}
}
