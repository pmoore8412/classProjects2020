package changeMaker;

import java.util.*;

/** Program {@code Change} asks the user for input between 1 and 99 and returns 
 * the amount of change in quarters, dimes, nickels, and pennies.
 * Has a check in place to make sure the user cannot 
 * enter in a number less than 1 or greater than 99.
 * */

public class Change 
{
	
	
	/**Main Method where user is asked for input ranging from 1 to 99 (inclusive)
	 * checks to make sure the user cannot enter a number less than 1 or greater than 99
	 * 
	 * <p>Variables used: boolean goodInput, int change
	 * <p>methods called: getChange(int changeRequested)
	 * <p>imported: Scanner class from java.util
	 * 
	 * @param args part of the default main method call
	 * */
	
	public static void main(String[] args) 
	{
		
		boolean goodInput = false; /* creates the boolean variable goodInput and sets it equal to false*/
		int change = 0; /* creates the int variable change to hold user input, set equal to 0 at start*/
		
		Scanner userInput = new Scanner(System.in); /** creates the scanner userInput to accept input from the user*/
		
		/* welcomes the user and gives the user the input range*/
		System.out.println("Hi and welcome to the change request kiosk.");
		System.out.println("I can give you change back for any amount ranging between 1 cent and 99 cents.");
		
		/* while loop used for the check so that the user must input the correct integer amount requested.
		 * goodInput variable set to true if user entered an integer in the amount requested
		 * */
		while (goodInput == false)
		{
			
			/* asks user for input*/
			System.out.println("Please input the amount of change you would like: ");
			change = userInput.nextInt();
			
			/* checks of the users input is between 1 and 99 while also accepting 1 and 99
			 * if amount is less than 1 or greater than 99 it will ask the user to re enter
			 * otherwise will call getChange method and set goodInput to true 
			 */
			if (change < 1 || change > 99) /* checks if change is less than one or greater than 99, if true asks user to retry*/
				System.out.println("I am sorry, but I am not capable of compleating that request. Please try again.");
			else
			{
				
				getChange(change); /* call to the getChange method sending the change inputed*/
				goodInput = true; /* sets goodInput variable to true*/
				
			}
		}

	}
	
	/**getChange Method calculates and prints out the amount of 
	 * change in the form of quarters, dimes, nickels, and pennies.
	 * Will only print out change that is returned. for example if quarters = 0
	 * dimes = 1, nickels = 1, and pennies = 1 the expected output should be:
	 * Dimes: 1 Nickels: 1 Pennies: 1
	 * 
	 * <p>Variables used: int quarters, int dimes, int nickels, int pennies
	 * <p>Arguments: int changeRequested
	 * <p>Modifier: public static
	 * <p>Return Type: void
	 * 
	 * @param changeRequested variable to accept user input
	 * */
	
	public static void getChange(int changeRequested)
	{
		
		int quarters = 0; /* creates the int variable quarters and sets it equal to 0*/
		int dimes = 0; /* creates the int variable dimes and sets it equal to 0*/
		int nickels = 0; /* creates the int variable nickels and sets it equal to 0*/
		int pennies= 0; /* creates the int variable pennies and sets it equal to 0*/
		
		/* while loop to check if change is equal to 0
		 * if changeRequested is not 0 run the block of 
		 * code in the while loop until changeRequested 
		 * is equal to 0.
		 */
		while (changeRequested != 0)
		{
			/* Checks if changeRequested - 25 is greater than or equal to 25
			 *  If true, execute code block. If false move on to next check */
			if (changeRequested - 25 >= 0) 
			{
				
				quarters++; /* increases quarters by 1 */
				changeRequested -= 25; /* reduces chageRequested by 25*/
				
			}
			/* checks if changeRequested - 10 is greater than or equal to 10
			 * If true, execute code block. If false move on to next check*/
			else if(changeRequested - 10 >= 0)
			{
				
				dimes++; /* increases dimes by 1*/
				changeRequested -= 10; /* reduces changeRequested by 10*/
				
			}
			/* checks if changeRequested - 5 is greater than or equal to 5
			 * If true, execute code block. If false move on to next check*/
			else if (changeRequested - 5 >= 0) 
			{
				
				nickels++; /* increases nickels by 1*/
				changeRequested -= 5; /* reduces changeRequested by 5*/
				
			}
			/* if all other conditions are not met and changeRequested is not equal to 0, block of code will execute*/
			else 
			{
				
				pennies++; /* increases pennies by 1*/
				changeRequested -= 1; /* reduces changeRequested by 1*/
				
			}
		}
		
		/* prints out the change results*/
		System.out.println("The chage comes out to:");
		if (quarters > 0) /* checks if there is more than 0 quarters, if there are prints the amount of quarters returned*/
			System.out.println("Quarters: " + quarters);
		if (dimes > 0) /* checks if there is more than 0 dimes, if there are prints the amount of dimes returned*/
			System.out.println("Dimes: " + dimes);
		if (nickels > 0) /* checks if there is more than 0 nickels, if there are prints the amount of nickels returned*/
			System.out.println("Nickels: " + nickels);
		if (pennies > 0) /* checks if there is more than 0 pennies, if there are prints the amount of pennies returned*/
			System.out.println("Pennies: " + pennies);
		
	}

}
