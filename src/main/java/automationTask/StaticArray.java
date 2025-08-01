package automationTask;

public class StaticArray {

	public static void main(String args[]) {
		
		// Initiolize and declare the static array and the array size is 5.
		
		int arr[] = { 5, 7, 6, 4, 3 };
		//System.out.println(arr[]);
		int result = 0;
		int avg = 0;
		int large = arr[0];
		int small = arr[0];

		for (int i = 0; i < arr.length; i++) {

			result = result + arr[i];
		}

		System.out.println(result);

		avg = result / 5;

		System.out.println(avg);

		// Print the largest and smallest value form the given array.

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			} else {
				small = arr[i];
			}
		}
		System.out.println(large);
		System.out.println(small);

	}

}