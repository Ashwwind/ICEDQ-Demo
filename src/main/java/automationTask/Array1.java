package automationTask;

public class Array1 {

	public static void main(String[] args) {
		// Declar 2D array using 3*3 element

		// int arr [][] = new int[3][3];
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}

		System.out.println("*************************");

		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				System.out.print(arr1[i][j] + arr2[i][j] + " ");

			}
			System.out.println(" ");
		}

		System.out.println("************");

		// transpose

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println(" ");
		}

	}

}
