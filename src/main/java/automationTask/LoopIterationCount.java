package automationTask;

public class LoopIterationCount {

	public static void main(String[] args) {

		// Print the loop iteration count using increment operator.
		// Using for loop

		int count = 0;
		System.out.println("Print the loop iteration count using increment order: ");
		for (int i = 0; i < 10; i++) {
			System.out.println("Loop iteration is : " + i);
			count++;
		}

		System.out.println("**************************");
		System.out.println("Total iteration Count is : " + count);

		// Print the loop iteration count using decrement operator.
		// Using for loop
		System.out.println("Print the loop iteration count using decrement order: ");
		for (int i = 10; i > 0; i--) {
			System.out.println("Loop iteration is : " + i);
			count--;
		}

		System.out.println("**************************");
		System.out.println("Total iteration Count is : " + count);
	}
}
  