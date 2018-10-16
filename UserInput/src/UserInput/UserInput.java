package UserInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your birthyear: ");
		boolean hasNextInt = scanner.hasNextInt();
		int year = scanner.nextInt();//picks up input from previous line so both variables are set
		System.out.println("hasnextint is " + hasNextInt);
		System.out.println("your year is " + year);
		scanner.nextLine(); //handles nextline char (enter), keeps from running over next input
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("your name is " + name);
		
		scanner.close();
	}

}
