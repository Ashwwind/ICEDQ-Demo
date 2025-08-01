package automationTask;

public class ArrayClass {

	public static void main(String[] args) {

		int arr[] = new int[5];

		// int arr1[] = {1,2,3,5,7};

		int sum = 0;
		int avg = 0;
		int large = arr[0];
		int small = arr[0];

		arr[0] = 7;
		arr[1] = 6;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 3;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);

		avg = sum / 5;
		System.out.println(avg);

		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			if (arr[i] > large) {
				large = arr[i];
			}
			else
			{
				small = arr[i];
			}
			
		}
		System.out.println(large);
		System.out.println(small);

	}

}
