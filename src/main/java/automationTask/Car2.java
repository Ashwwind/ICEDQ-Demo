package automationTask;

public class Car2 {

	// Declare car properties
	String brand;
	String model;
	String year;

	// Declare car method
	public Car2(String Brand, String Model, String Year) {
		System.out.println("Car Brand is: " + Brand + "||" + "Car Model is: " + Model + "||" + "Car Year is: " + Year);

	}

	public static void main(String[] args) {

		Car2 car1 = new Car2("Maruti Suzuki", "Swift", "2013");

		Car2 car2 = new Car2("Tata", "Tata Nexon", "2015");

		Car2 car3 = new Car2("Mahindra", "Tar", "2010");

	}
}
