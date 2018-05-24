package top.xmxin.vehicle;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****************");
		System.out.println("*     停车场	*");
		System.out.println("*****************");
		int option;
		while (true) {
			System.out.println("输入1选择小车类型，输入2选择公交车类型:");
			option = sc.nextInt();
			if(option == 1 || option == 2)
				break;
			else {
				System.out.println("你的选择有误！");
			}
		}
		if(option == 1) {
			System.out.println("请输入你车子的品牌:");
			String Brands = sc.next();
			System.out.println("请输入你车子的车牌号:");
			String CarID = sc.next();
			String model;
			while (true) {
				System.out.println("请输入你车子的车型:");
				model = sc.next();
				if(model.equals("Hatchback") || model.equals("Sedan") || model.equals("SUV"))
					break;
				else {
					System.out.println("未找到你输入的车型！");
				}
			}
			System.out.println("请输入停放的天数:");
			int days = sc.nextInt();
			Car car = new Car(Brands, CarID, model);
			System.out.println("你需缴费:" + car.getSumRent(days));
		}else if(option == 2) {
			System.out.println("请输入你车子的品牌:");
			String Brands = sc.next();
			System.out.println("请输入你车子的车牌号:");
			String CarID = sc.next();
			int seat;
			while (true) {
				System.out.println("请输入你车子的座位数:");
				seat = sc.nextInt();
				if(seat < 1)
					System.out.println("你的车至少要有一个座位！");
				else {
					break;
				}
			}
			System.out.println("请输入停放的天数:");
			int days = sc.nextInt();
			Bus bus = new Bus(Brands, CarID, seat);
			System.out.println("你需缴费:" + bus.getSumRent(days));
		}
		
		sc.close();
	}

}
