package lab5;

import java.util.Scanner;

public class Lab5Facts {
	static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		// User Prompt for input.
		System.out.println(
				"Welcome to the factorial calculator! \n \nYou could be using a regular calculator, but I built this one, so ... you're welcome!");
		System.out.println("\n \nPlease enter an interger greater than 0, but less than 21.");

		// Accepts user input.
		int userNum = read.nextInt();

		// Calls the method with the math. I debated putting the user input scanner in
		// the facts() method, but didn't think of it until I was halfway through, so I
		// left things where they were.
		facts(userNum);
	}

	// New method will be called to loop, rather than using do-while.
	public static void facts(int userNum) {

		// fact needs to have a value of one, so that the recursive multiplication of
		// the loops will work.
		long fact = 1;

		// If statement will only accept inputs up to 20, because factorials larger
		//than that can't be stored.
		if ((userNum < 20) || (userNum > 1)) {

			// 1 multiplied by the increasing value will yield the same as userNum!
			for (long i = 1; i < (userNum + 1); i++) {
				fact *= i;
			}
			System.out.println("The factorial of " + userNum + " is " + fact + ".");
		}
		// If the user enters invalid input, the same method is called to loop. Again,
		// we take input here because this is when it occurred to me to put the 		//original input scan in this method, but I didn't want to move it.
		else {
			System.out.println("Please enter integer between between 1 and 20, inclusive.");
			userNum = read.nextInt();
			facts(userNum);
		}
		// User prompt to continue.
		System.out.println("Would you like to continue? (y/n)");
		read.nextLine(); // clears the scanner
		String userAns = read.next();

		// Allows the method to be called again if the user wants to loop. Otherwise
		// quits.
		if (userAns.equals("y")) {
			System.out.println("Please enter integer between between 1 and 20, inclusive.");
			userNum = read.nextInt();
			facts(userNum);
		} else {
			System.out.println("Thanks. Bye!");
		}
	}
}