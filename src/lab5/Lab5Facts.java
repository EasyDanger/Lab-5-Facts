package lab5;

import java.util.Scanner;

public class Lab5Facts {
		static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		

		System.out.println("Welcome to the factorial calculator! \n \nYou could be using a regular calculator, but I built this one, so ... you're welcome!");
		System.out.println("\n \nPlease enter an interger greater than 0, but less than 21.");
		int userNum = read.nextInt();

	facts(userNum);
	}
	
	public static void facts(int userNum) {
		long fact = 1;
		if ((userNum < 20) || (userNum > 1)) {
		for (long i = 1; i < (userNum + 1); i++) {
			fact *= i;
		}
		System.out.println("The factorial of " + userNum + " is " + fact + ".");
		}
		else {
			System.out.println("Please enter integer between between 1 and 20, inclusive.");
			userNum = read.nextInt();
			facts(userNum);
				
		}
		System.out.println("Would you like to continue? (y/n)");
		read.nextLine();
		String userAns = read.next();
		if (userAns.equals("y")) {
			System.out.println("Please enter integer between between 1 and 20, inclusive.");
			userNum = read.nextInt();
			facts(userNum);
		}else {
			System.out.println("Thanks. Bye!");
		}
	}
}