package automationTask;

import java.util.Scanner;

public class StdResultOnMarks {

	public static void main(String[] args) {
		// Take a user input as a mark using scanner class

		Scanner stdMark = new Scanner(System.in);
		System.out.println("Enter student marks: ");
		int mark = stdMark.nextInt();

		// Print the student grades on the mark obtained.
		if (mark >= 90 && mark <= 100) {
			System.out.println("Student pass in A++ grades:");
		} else if (mark >= 80 && mark <= 70) {
			System.out.println("Student pass in B++ grades:");
		} else if (mark > 70 && mark <= 60) {
			System.out.println("Student pass in C++ grades:");
		} else if (mark > 50 && mark <= 60) {
			System.out.println("Student pass in D++ grades:");
		} else {
			System.out.println("Invalid mark:");
		}

		stdMark.close();

	}

}
