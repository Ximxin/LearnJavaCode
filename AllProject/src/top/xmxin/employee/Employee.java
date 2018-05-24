package top.xmxin.employee;

/*
 * 1) ����EmployeeԱ���࣬��������name,
 * �����·�birthMonth�ȳ�Ա����;
 * ��getSalary{int month)������ȡԱ�� ��
 */
public class Employee {
	private int birthMonth;
	private String name;
	public Employee(String name, int birthMonth) {
		this.name = name;
		if(birthMonth < 1 || birthMonth > 12)
			System.out.println("��������·ݲ����Ϲ���");
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
