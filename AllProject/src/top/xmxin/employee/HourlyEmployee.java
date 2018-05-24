package top.xmxin.employee;

public class HourlyEmployee extends Employee {
	private int hour;
	private int hourlySalary;
	public HourlyEmployee(String name, int birthMonth, int hour, int hourlySalary) {
		super(name, birthMonth);
		this.hour = hour;
		this.hourlySalary = hourlySalary;
	}
	@Override
	public double getSalary(int month) {
		if(hour > 160)
			return super.getSalary(month) + hour * hourlySalary + ((hour - 160) * hourlySalary) * 0.5;
		else
			return super.getSalary(month) + hour * hourlySalary;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getHourlySalary() {
		return hourlySalary;
	}
	public void setHourlySalary(int hourlySalary) {
		this.hourlySalary = hourlySalary;
	}
}
