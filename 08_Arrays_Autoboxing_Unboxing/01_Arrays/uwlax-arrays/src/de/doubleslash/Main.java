package de.doubleslash;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		/* 
		 * 1. Declare and instantiate on a single line a one-dimensional array called strArr that holds 50
		 * Strings
		 * 
		 */
		
//			String[] strArr = new String[50]; 
		
		/*
		 * Declare on one line and instantiate on a second line a one-dimensional array called strArr that
			holds 50 Strings.

		 */
		
//		String[] strArr; 
//		strArr = new String[50]; 
		
		/*
		
		 Initialize every position in strArr to a backslash. Do not hardcode the length of the array in
		 any way
		 
		 */
		
//		for (int i = 0; i < strArr.length; i++) {
//			// Need to escape character in order to print correctly. 
//			strArr[i] = "\\"; 
//		}
		
		/*
		Starting at the end of strArr and working back toward the beginning, display each index and
		the element stored at that index, separated by a colon (:). Each entry should be displayed on a
		separate line. Do not hardcode the length of the array in any way
		*/
		
//		for (int i = strArr.length - 1; i >= 0; i--) {
//			System.out.println(i + ": " + strArr[i]);
//		}
		
		/*
		 Consider the array intArr below, which has been lled with random numbers. Fill in the code
		 to sort the array from smallest to largest.
		 */
		
//		Random rand = new Random () ;
//		int [] intArr = new int [50];
//		for (int i = 0; i < intArr . length ; i ++) {
//			intArr [ i ] = rand . nextInt (50) ;
//		}
//		
//		for (int i = 0; i < intArr.length; i++) {
//			int num1 = intArr[i]; 
//			for (int j = i + 1; j < intArr.length; j++) {
//				int num2 = intArr[j];
//				
//				if (num1 > num2) {
//					int temp = num1; 
//					intArr[i] = num2; 
//					intArr[j] = temp; 
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(intArr));
//		
		// Suggested solution: 
//		
//		for (int i = 0; i < intArr.length; i++) {
//			int indexOfMin = i;
//			for (int j = i + 1; j < intArr.length; j++) {
//				if (intArr[j] < intArr[indexOfMin]) {
//					indexOfMin = j;
//				}
//			}
//			if (indexOfMin != i) {
//				int tmp = intArr[i];
//				intArr[i] = intArr[indexOfMin];
//				intArr[indexOfMin] = tmp;
//			}
//		}
		
		

//		13. Declare and instantiate on a single line a two-dimensional array called intArr that holds int
//		 values and has 5 rows and 8 columns.

		
//		int[][] intArr= new int [5][8]; 
		
		
//		 Declare one one line and instantiate on a second line a two-dimensional array called intArr
//		 that holds int values and has 5 rows and 8 columns.
		
		int[][] intArray; 
//		intArray = new int[5][8]; 
		
//		15. Declare on one line a two-dimensional array of int values called intArr. On the second line,
//		allocate memory for 5 rows. On subsequent lines, allocate memory for each row to have 8 columns.
		
		intArray = new int[5][];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = new int[8];
			
//			16. Fill in each cell of the intArr array from the previous question with the result of multiplying
//			that cell's column index by its row index. Do not hardcode the length of the array in any way.
				
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = i * j; 
			}
		}
		
//		17. Print each row of the intArr array from the previous question in order on separate lines.
//		Entries should be separated by a single space. The last entry in each row should be followed by a
//		colon (:) and then the sum of the entries in that row. Do not hardcode the length of the array in
//		any way.
		
		for (int i = 0; i < intArray.length; i++) {
			int rowSum = 0; 
			for (int j = 0; j < intArray[i].length; j++) {
				rowSum += intArray[i][j];
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println(": " + rowSum); //Wird sowieso auf der gleichen Zeile angezeigt, besserer Lösungsvorschlag.
		}

		
		// For loop for multidimensional array
		
//		for (int i = 0; i < intArray.length; i++) {
//			for (int j = 0; j < intArray[i].length; j++) {
//				System.out.print(intArray[i][j] + "  ");
//			}
//			System.out.println();
//		}
		
		

		
		

		


	}

}
