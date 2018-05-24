package top.xmxin.vehicle;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****************");
		System.out.println("*     ͣ����	*");
		System.out.println("*****************");
		int option;
		while (true) {
			System.out.println("����1ѡ��С�����ͣ�����2ѡ�񹫽�������:");
			option = sc.nextInt();
			if(option == 1 || option == 2)
				break;
			else {
				System.out.println("���ѡ������");
			}
		}
		if(option == 1) {
			System.out.println("�������㳵�ӵ�Ʒ��:");
			String Brands = sc.next();
			System.out.println("�������㳵�ӵĳ��ƺ�:");
			String CarID = sc.next();
			String model;
			while (true) {
				System.out.println("�������㳵�ӵĳ���:");
				model = sc.next();
				if(model.equals("Hatchback") || model.equals("Sedan") || model.equals("SUV"))
					break;
				else {
					System.out.println("δ�ҵ�������ĳ��ͣ�");
				}
			}
			System.out.println("������ͣ�ŵ�����:");
			int days = sc.nextInt();
			Car car = new Car(Brands, CarID, model);
			System.out.println("����ɷ�:" + car.getSumRent(days));
		}else if(option == 2) {
			System.out.println("�������㳵�ӵ�Ʒ��:");
			String Brands = sc.next();
			System.out.println("�������㳵�ӵĳ��ƺ�:");
			String CarID = sc.next();
			int seat;
			while (true) {
				System.out.println("�������㳵�ӵ���λ��:");
				seat = sc.nextInt();
				if(seat < 1)
					System.out.println("��ĳ�����Ҫ��һ����λ��");
				else {
					break;
				}
			}
			System.out.println("������ͣ�ŵ�����:");
			int days = sc.nextInt();
			Bus bus = new Bus(Brands, CarID, seat);
			System.out.println("����ɷ�:" + bus.getSumRent(days));
		}
		
		sc.close();
	}

}
