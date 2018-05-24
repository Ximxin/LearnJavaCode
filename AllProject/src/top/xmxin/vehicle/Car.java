package top.xmxin.vehicle;

public class Car extends Vehicle {
	private int model;
	public Car(String Brands, String CarID, String model) {
		super(Brands, CarID);
		switch(model) {
		case "Hatchback":
			this.model = 300;
			break;
		case "Sedan":
			this.model = 350;
			break;
		case "SUV":
			this.model = 500;
			break;
		}
	}

	@Override
	public double getSumRent(int days) {
		return super.getSumRent(days) * model;
	}

}
