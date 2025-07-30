package automationTask;

public class PrintOneToTen {

	public static void main(String[] args) {
		// To print 1 to 10 number using for loop

		System.out.println("Print 1 to 10 number using for loop");
		int number = 1;

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// for (int j : number > 0)

		System.out.println("**********************************");

		System.out.println("Print 1 to 10 number using while loop");

		while (number <= 10)

		{
			System.out.println(number);
			number++;
		}

	}
}
