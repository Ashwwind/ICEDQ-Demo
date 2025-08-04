package automationTask;

import java.util.Scanner;

public class StringConcatination {

	public static void main(String[] args) {
		// Take a two input string and concatenate in the result.
		// Create a scanner class
		Scanner userInput = new Scanner(System.in);

		// Enter the First Name

		System.out.println("Enter the first name: ");
		String fname = userInput.next();

		// Enter the First Name
		System.out.println("Enter the last name: ");
		String lname = userInput.next();

		// Concatenate two string

		String fullname = fname +" "+ lname;

		System.out.println("Full name is : " + fullname);

		userInput.close();

	}

}
 