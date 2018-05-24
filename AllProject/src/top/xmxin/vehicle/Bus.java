package top.xmxin.vehicle;

public class Bus extends Vehicle {

	private int seat;		//×ùÎ»
	
	public Bus(String Brands, String CarID, int seat) {
		super(Brands, CarID);
		if (seat > 16)
			this.seat = 800;
		else
			this.seat = 600;
	}

	@Override
	public double getSumRent(int days) {
		return days * seat;
	}
	
	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

}