package top.xmxin.vehicle;

public class Vehicle {

	private String Brands;		//Ʒ��
	private String CarID;		//���ƺ�
	
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
