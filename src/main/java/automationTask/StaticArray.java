package automationTask;

public class StaticArray {
	
public static void main(String args[])
{
	int arr[] = {5,7,6,4,3};
	int result =0;
	int avg =0;
	
	for(int i=0; i<arr.length; i++)
	{
		
		result = result + arr[i];
	}
	
	System.out.println(result);
	
	avg = result/5;
	
	System.out.println(avg);
	
}

}