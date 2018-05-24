package top.xmxin.employee;

/*
 * 1) 定义Employee员工类，包括姓名name,
 * 出生月份birthMonth等成员变量;
 * 有getSalary{int month)方法获取员工 资
 */
public class Employee {
	private int birthMonth;
	private String name;
	public Employee(String name, int birthMonth) {
		this.name = name;
		if(birthMonth < 1 || birthMonth > 12)
			System.out.println("你的生日月份不符合规则！");
		else
			this.birthMonth = birthMonth;
	}
	public double getSalary(int month) {
		if(birthMonth == month) {
			return 250;
		}
		return 0;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
