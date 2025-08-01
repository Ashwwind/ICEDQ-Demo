package automationTask;

public class Car {
	
	// Car class properties
	String brand;
	String model;
	String year;
	
	// Car class behavior
	public void displayInfo(String brand, String model, String year)
	{
		System.out.println(brand + " "+ model + " "+year);
	}

	public static void main(String[] args) {
		
		Car obj1 = new Car();
		obj1.displayInfo("Toyota","Corolla","2010");

		Car obj2 = new Car();
		obj2.displayInfo("BMW","X5","2013");
		
		Car obj3 = new Car();
		obj3.displayInfo("Ford","Mustang","2015");
	}

}
