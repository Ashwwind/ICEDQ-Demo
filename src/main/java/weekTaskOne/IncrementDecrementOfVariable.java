package automationTask;

public class IncrementDecrementOfVariable {

	public static void main(String[] args) {

		int i = 10;
		int j = 5;

		// Post increment
		i = i++;
		System.out.println(i);
		// Post decrement
		i = i--;
		System.out.println(i);

		// Pre increment
		j = ++j;
		System.out.println(j);
		// Pre decrement
		j = --j;
		System.out.println(j);

		System.out.println("*********************");

		int x = 5;
		// int y = x++ + x++;
		int y = ++x + ++x;
		System.out.println(x);
		System.out.println(y);

		System.out.println("*********************");

		int a = 10;
		float b = 10.5f;
		double c;

		// Post and Pre increment
		c = a + b + a-- + b-- + --a + --b;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println("*********************");

		// Post and Pre decrement
		c = a + b + a++ + b++ + ++a + ++b;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// Loop iteration

		// Count iteration using increment
		System.out.println("*********************");
		System.out.println("Count how many iterations a loop goes through using increment");

		int count = 0;
		for (int k = 0; k < 10; k++) {
			count++;
		}
		System.out.println(count);

		// Count iteration using decrement
		System.out.println("*********************");
		System.out.println("Count how many iterations a loop goes through using decrement");

		int count1 = 10;
		for (int m = 10; m > 0; m--) {
			count1--;
		}
		System.out.println(count1);
	}

}
