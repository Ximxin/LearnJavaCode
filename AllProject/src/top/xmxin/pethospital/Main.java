package top.xmxin.pethospital;

public class Main {

	public static void main(String[] args) {
		show(new Dog("大白", Gender.公, Color.white));
		show(new Cat("小黄", Gender.母, Color.yellow));
		show(new Dog("Juzi", Gender.母, Color.orange));
	}
	
	public static void show(Pet pet) {
		pet.Shout();
		if(pet instanceof Dog) {
			Dog dog = (Dog)pet;
			System.out.println("修改前-----------");
			dog.showPet();
			dog.reSetPetColor(Color.yellow);
			System.out.println("修改后-----------");
			dog.showPet();
		}else if(pet instanceof Cat) {
			Cat cat = (Cat)pet;
			System.out.println("修改前-----------");
			cat.showPet();
			cat.reSetPetColor(Color.orange);
			System.out.println("修改后-----------");
			cat.showPet();
		}
			
	}

}
