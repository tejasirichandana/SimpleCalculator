/*
 * Project Title : Simple Calculator
 * Name          : DASARI TEJASIRI CHANDANA
 * Internship    : CodeOrbit Tech
 * Description   : A console-based calculator that supports
 *                 addition, subtraction, multiplication,
 *                 and division on multiple numbers.
 * Features      : Multiple number operations
 *                 Exception handling
 *                 Division by zero handling
 *                 User-friendly menu
 */

package Simple_Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Scanner object for user input
Scanner sc=new Scanner(System.in);
// Variable to control calculator repetition
 char again = 'Y';
do {
	try {
		// Display calculator menu
		System.out.println();
		System.out.println("================================");
		System.out.println(" SIMPLE CALCULATOR");
		System.out.println("================================");
	    System.out.println("1. Addition");
	    System.out.println("2. Subtraction");
	    System.out.println("3. Multiplication");
	    System.out.println("4. Division");
	    System.out.println("5. Exit");
	       // Read user choice
	   System.out.print("Choose Operation (1-5): ");
	int choice = sc.nextInt();
	// Exit option
	if (choice == 5) {
		System.out.println("Thank you for using Calculator!");
		break;
	}
	// Ask for number of inputs
	System.out.print("How many numbers do you want to use? ");
	int n = sc.nextInt();
	// Validate minimum numbers
	if (n < 2) {
		System.out.println("Please enter at least 2 numbers.");
		continue;
	}

	double result = 0;
	// Perform selected operation
	switch (choice) {

	case 1:// Addition of numbers

		result = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print("Enter number " + i + ": ");
			result += sc.nextDouble();
		}

		System.out.println("Sum = " + result);
		break;

	case 2: // Subtraction of numbers

		System.out.print("Enter number 1: ");
		result = sc.nextDouble();

		for (int i = 2; i <= n; i++) {
			System.out.print("Enter number " + i + ": ");
			result -= sc.nextDouble();
		}

		System.out.println("Subtraction  = " + result);
		break;

	case 3: // Multiplication of Numbers

		result = 1;

		for (int i = 1; i <= n; i++) {
			System.out.print("Enter number " + i + ": ");
			result *= sc.nextDouble();
		}

		System.out.println("Product = " + result);
		break;

	case 4: // Division
		// Division operation with zero check
		System.out.print("Enter number 1: ");
		result = sc.nextDouble();

		boolean valid = true;

		for (int i = 2; i <= n; i++) {

			System.out.print("Enter number " + i + ": ");
			double num = sc.nextDouble();
			// Prevent division by zero

			if (num == 0) {
				System.out.println("Error! Division by zero is not allowed.");
				valid = false;
				break;
			}

			result /= num;
		}

		if (valid) {
			System.out.println("Result = " + result);
		}

		break;

	default:
		System.out.println("Invalid Choice!");
	}

} 
	// Handle invalid input such as text instead of numbers
    catch (InputMismatchException e) 
	{
	System.out.println("Invalid Input! Please enter numbers only.");
	sc.nextLine(); // clear invalid input
     }
	// Ask user whether to continue
System.out.print("\nDo you want another calculation? (Y/N): ");
 again = sc.next().charAt(0);

} while (again == 'Y' || again == 'y');

System.out.println("\nCalculator Closed.");
 //Close scanner resource
 sc.close();
	}

}
