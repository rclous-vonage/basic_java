package Loops;

public class ForLoop {
	public static void main(String[] args) {
		// for(init; termination; increment) {
		// init some variable, term has to == false at end of loop, increment
		for(int i=2; i <= 8; i++) {
			System.out.println("interest rate = " + i);
			System.out.println(calculateInterest(10000.00, i));
		}
	}
	public static double calculateInterest(double amount, double interestRate) {
		return(amount * interestRate/100);
	}
}
