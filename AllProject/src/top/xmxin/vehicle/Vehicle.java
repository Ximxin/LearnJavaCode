package top.xmxin.vehicle;

public class Vehicle {

	private String Brands;		//Æ·ÅÆ
	private String CarID;		//³µÅÆºÅ
	
	public Vehicle (String Brands, String CarID) {
		this.Brands = Brands;
		this.CarID = CarID;
	}
	
	public double getSumRent(int days) {
		return days;
	}
	
	public String getBrands() {
		return Brands;
	}
	public void setBrands(String brands) {
		Brands = brands;
	}
	public String getCarID() {
		return CarID;
	}
	public void setCarID(String carID) {
		CarID = carID;
	}

}
