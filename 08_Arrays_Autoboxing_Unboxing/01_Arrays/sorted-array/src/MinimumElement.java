import java.util.Scanner;

public class MinimumElement {
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
			userIntegers[i] = sc.nextInt(); 
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
	
	public static void main(String[] args) {
		int length = readInteger();
		int[] userArray = readElements(length); 
//		System.out.println(userArray);
//		int min = findMin(userArray); 
//		System.out.println(min);
	}
}
