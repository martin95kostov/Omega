package classesObjects;

public class Car {

	private String brand;
	private String model;
	private int manYear;
	private int power;

	public Car(String brand, String model, int manYear, int power) {
		this.brand = brand;
		this.model = model;
		this.manYear = manYear;
		this.power = power;

	}

	private void insuranceCategory() {
		int age = 2018 - manYear;
		System.out.println(brand + " " + model + "" + manYear + " " + power);

		if (age <= 8) {
			int tax = 150;
			if (power < 80) {

				double taxBoost = tax * 20 / 100 + tax;
				System.out.println("Category 1 tax:" + taxBoost);
			} else if (power > 140) {
				double taxBoost = tax * 45 / 100 + tax;
				System.out.println("Category 1 tax:" + taxBoost);
			} else
				System.out.println("Category 1 tax:" + tax);

		} else if (age <= 15) {
			int tax = 200;
			if (power < 80) {

				double taxBoost = tax * 20 / 100 + tax;
				System.out.println("Category 2 tax:" + taxBoost);
			} else if (power > 140) {
				double taxBoost = tax * 45 / 100 + tax;
				System.out.println("Category 2 tax:" + taxBoost);
			} else
				System.out.println("Category 2 tax:" + tax);
		} else if (age <= 25) {
			int tax = 300;
			if (power < 80) {

				double taxBoost = tax * 20 / 100 + tax;
				System.out.println("Category 3 tax:" + taxBoost);
			} else if (power > 140) {
				double taxBoost = tax * 45 / 100 + tax;
				System.out.println("Category 3 tax:" + taxBoost);
			} else
				System.out.println("Category 3 tax:" + tax);
		} else if (age > 25) {

			int tax = 500;

			if (power < 80) {

				double taxBoost = tax * 20 / 100 + tax;
				System.out.println("Category 4 tax:" + taxBoost);
			} else if (power > 140) {
				double taxBoost = tax * 45 / 100 + tax;
				System.out.println("Category 4 tax:" + taxBoost);
			} else
				System.out.println("Category 4 tax:" + tax);
		}

	}

	public static void main(String[] args) {

		Car mycar0 = new Car("renault", "laguna", 2017, 150);
		Car mycar1 = new Car("renault", "megane", 1999, 70);
		Car mycar2 = new Car("renault", "talisman", 2005, 200);
		Car mycar3 = new Car("renault", "19", 2000, 180);
		Car mycar4 = new Car("renault", "captur", 2008, 100);
		Car mycar5 = new Car("renault", "clio", 1980, 100);
		Car mycar6 = new Car("renault", "latitude", 1990, 150);
		mycar0.insuranceCategory();
		mycar1.insuranceCategory();
		mycar2.insuranceCategory();
		mycar3.insuranceCategory();
		mycar4.insuranceCategory();
		mycar5.insuranceCategory();
		mycar6.insuranceCategory();

	}
}
