package top.xmxin.employee;

public class SalesEmployee extends Employee {
	int sales;
	double commission;
	public SalesEmployee(String name, int birthMonth, int sales, double commission) {
		super(name, birthMonth);
		this.sales = sales;
		this.commission = commission;
	}
	@Override
	public double getSalary(int month) {
		return super.getSalary(month) + sales * commission;
	}
	
}
