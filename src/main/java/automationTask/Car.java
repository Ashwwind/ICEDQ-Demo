package automationTask;

public class Car {

	// Declare car properties
	String brand;
	String model;
	String year;

	// Declare car method
	public void displayInfo(String Brand, String Model, String Year) {
		System.out.println("Car Brand is: " + Brand);
		System.out.println("Car Model is: " + Model);
		System.out.println("Car Year is: " + Year);
	}

	public static void main(String[] args) {

		Car obj = new Car();
		obj.displayInfo("Maruti Suzuki", "Swift", "2013");

	}

}
