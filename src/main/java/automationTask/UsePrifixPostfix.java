package automationTask;

public class UsePrifixPostfix {

	public static void main(String[] args) {

		int i = 10;
		int j = 20;
		int result = 0;

		// Using Prifix
		result = i + j;
		System.out.println(result);
		result++;
		System.out.println(result);
		--result;
		System.out.println(result);
		
		--i;
		System.out.println(i);
		j++;
		System.out.println(j);
	}

}
