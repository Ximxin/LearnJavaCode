package top.xmxin.employee;

public class SalarieEmployee extends Employee {
	private int monthlySalary;
	public SalarieEmployee(String name, int birthMonth, int monthlySalary) {
		super(name, birthMonth);
		this.monthlySalary = monthlySalary;
	}
	@Override
	public double getSalary(int month) {
		return super.getSalary(month) + monthlySalary;
	}
}
