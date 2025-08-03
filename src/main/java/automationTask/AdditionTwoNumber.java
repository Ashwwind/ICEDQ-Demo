package automationTask;

public class AdditionTwoNumber {

	static int sum = 0;

	public int add(int a, int b) {
		sum = a + b;
		return sum;
	}

	public static void main(String[] args) {

		AdditionTwoNumber Obj = new AdditionTwoNumber();
		Obj.add(10, 25);

		System.out.println("Total sum is : " + sum);

	}

}
