package automationTask;

public class Multiplication {
	
	int result=0;
	double result1=0;
	
	public void multiply(int i, int j)
	{
		result = i*j;
		System.out.println(result);
	}
	
	public void multiply(double a, double b)
	{
		result1 = a*b;
		System.out.println(result1);
	}
	
	public void multiply(int x, int y, int z)
	{
		result = x*y*z;
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		Multiplication Obj = new Multiplication();
		
		Obj.multiply(10, 10);
		Obj.multiply(10.5, 10.5);
		Obj.multiply(10,10,10);
		

	}

}
