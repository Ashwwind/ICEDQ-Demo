package automationTask;

public class CombineStringAndInteger {

	public static void main(String[] args) {

		// Declare two string and integer value.
		int i = 10;
		int j = 20;
		String str1 = "Ashwin";
		String str2 = "Doye";

		// Prints the permutation and combination of string and integer value.

		// 1.
		System.out.println("1: "+ i + j + str1 + str2);

		// 2.
		System.out.println("2: "+str1 + str2 + i + j);

		// 3.
		System.out.println("3: "+str1 + i + j + str2);

		// 4.
		System.out.println("4: "+i + str1 + str2 + j);

		// 5.
		System.out.println("5: "+str1 + i + str2 + j);

		// 6.
		System.out.println("6: "+i + str1 + j + str2);
		
		// 7. 
		System.out.println(i+j+" "+str1+" "+str2);
		
		// 8.
		System.out.println("8: "+i+" "+j);
		
		// 9. 
		System.out.println("9: "+str1+" "+str2+i+j);

	}

}
