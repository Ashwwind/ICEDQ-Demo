package automationTask;

public class IncrementDecrementOfVariable {

	public static void main(String[] args) {

		int i = 10;
		int j = 5;

		// Post increment
		i = i++;
		System.out.println(i);
		// Pre increment
		i = --i;
		System.out.println(i);

		// Pre increment
		j = j++;
		System.out.println(j);
		j = --j;
		System.out.println(j);

		int x = 5;
		// int y = x++ + x++;
		int y = ++x + ++x;
		System.out.println(x);
		System.out.println(y);

		int a = 10;
		float b = 10.5f;
		double c;

		c = a + b + a++ + b++ + ++a + ++b;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// count interation

		int count = 0;

		for (int k = 0; k < 10; i++) {
			count++;
		}
		System.out.println(count);
		
		int count1=10;
		
		for(int m=10; m>0; m--)
		{
			count1--;
		}
		System.out.println(count1);
		
	}

}
