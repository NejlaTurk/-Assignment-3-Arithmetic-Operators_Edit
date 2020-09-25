package Assignment3_ArithmaticOperators;

public class Question_7 {

	public static void main(String[] args) {
		
		/*Write a program that determines the change to be dispensed from a vending machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single dollar bill to pay for the item.

      Sample output

      Price in cents : 95

      Your change is 0 quarters, 0 dimes, and 1 nickles */
		
		int value=95;
		int change = 100 - value;
		
		int quarters= change/25;	
		change = change % 25;
		int dimes= change/10; 	
		change = change % 10;
		int nickles= change/5;						
		change = change % 5;
		
		
		System.out.println("Your change is " + quarters + " quarters, " + dimes+ " dimes, and " +  nickles + " nickels");
	
	
	}

}
