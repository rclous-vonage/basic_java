package Arrays;
import java.util.Scanner;
public class Main {
	

	public static void main(String[] args) {
		// arrays are a reference types
		// int1 = int2 makes a duplicate object
		// arr1 = arr2 accesses the same value in memory
		int[] myIntArray;
		myIntArray = new int[10]; // created an integer array w/ 10 elements in it

		myIntArray[5] =  50; // element 6, starts at 0
		System.out.println(myIntArray[5]);
		int[] myIntArray2 = new int[]{ 1,2,3,4,5,6,7,8,9,10};
		int[] myIntArray3 = new int[25];
		for(int i=0; i<myIntArray3.length; i++) {
			myIntArray3[i] = i*10;
			System.out.println("element" + i + "=" + myIntArray3[i]);
		}
		Scanner scanner = new Scanner(System.in);
		Arrays groceryList = new Arrays();// Arrays should be groceryList
//		printInstructions(); missing print instructions portion
		boolean quit = false;
		int choice = 0;
		while(!quit) {
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0:
//				printInstructions();
				break;
//			default;
//				return null;
			
			}
		}

		
	} 


}
