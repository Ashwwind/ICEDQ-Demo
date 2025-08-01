package automationTask;

public class StaticArray {

	public static void main(String args[]) {

		// Initialize and declare the static array and the array size is 5.

		int arr[] = { 5, 7, 6, 4, 3 };

		int sum = 0;
		int avg = 0;
		int large = arr[0];
		int small = arr[0];

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
		}

		System.out.println("Array element : " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4]);

		System.out.println("Calculate the total sum of the given array : " + sum);

		avg = sum / 5;

		System.out.println("Calculate the average of the given array :" + avg);

		// Print the largest and smallest value form the given array.

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			} else {
				small = arr[i];
			}
		}
		System.out.println("The largest element of array : " + large);
		System.out.println("The smallest element of array : " + small);

	}

}