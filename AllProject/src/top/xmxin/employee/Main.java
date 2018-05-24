package top.xmxin.employee;
public class Main {

	public static void main(String[] args) {
		SalesEmployee Zhangsan = new SalesEmployee("", 5, 60000, 0.25);
		System.out.println("张三的工资:" + Zhangsan.getSalary(6));
	}

}
