package automationTask;

import java.util.Scanner;

public class TakeUserInputAndPrint {

	public static void main(String[] args) {

		// Take a user Input for each Data Types and display in result.
		// For taking user input we need a Scanner class
	
		Scanner userInput = new Scanner(System.in);

		// Take user input Int Data Type and print its value.
		System.out.println("Enter the Int Data Types value such as age:");
		int age = userInput.nextInt();
		System.out.println("Age is: " + age);
		System.out.println("------------------------------------------------------");

		// Take user input Float Data Type and print its value.
		System.out.println("Enter the Float Data Types value such as indian curency:");
		float currency = userInput.nextFloat();
		System.out.println("Indian currency is: " + currency);
		System.out.println("------------------------------------------------------");

		// Take user input Byte Data Type and print its value.
		System.out.println("Enter the Byte Data Types value such as student roll no.:");
		byte stdRollNo = userInput.nextByte();
		System.out.println("Student Roll no. is: " + stdRollNo);
		System.out.println("------------------------------------------------------");

		// Take user input Double Data Type and print its value.
		System.out.println("Enter the Double Data Types value such as student marks.:");
		double stdMark = userInput.nextDouble();
		System.out.println("Student Marks is: " + stdMark);
		System.out.println("------------------------------------------------------");

		// Take user input Boolean Data Type and print its value.
		System.out.println("Enter the Boolean Data Types value such as student result.:");
		boolean stdPass = userInput.nextBoolean();
		System.out.println("Student result pass (true or false) : " + stdPass);
		System.out.println("------------------------------------------------------");

		// Take user input Sting and print its value.
		System.out.println("Enter the Sting value such as student name.:");
		String stdName = userInput.next();
		System.out.println("Student name is: " + stdName);
		System.out.println("------------------------------------------------------");

		// Take user input Sting and print its value.
		System.out.println("Enter the Sting value such as student full name.:");
		String stdFullName = userInput.nextLine();
		System.out.println("Student full name is: " + stdFullName);
		System.out.println("------------------------------------------------------");
		
		userInput.close();
	}

}
