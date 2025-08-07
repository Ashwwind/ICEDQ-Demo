package automationTask;

public class Car {

	// Car class properties
	String brand;
	String model;
	String year;
	
	// Car class behavior
	public void displayInfo(String Brand, String Model, String Year)
	{
		System.out.println(Brand + " "+ Model + " "+Year);
	}

	public static void main(String[] args) {
		
		Car obj1 = new Car();
		obj1.displayInfo("Toyota","Corolla","2010");
	}

}
