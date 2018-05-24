package top.xmxin.pethospital;

public class Main {

	public static void main(String[] args) {
		show(new Dog("���", Gender.��, Color.white));
		show(new Cat("С��", Gender.ĸ, Color.yellow));
		show(new Dog("Juzi", Gender.ĸ, Color.orange));
	}
	
	public static void show(Pet pet) {
		pet.Shout();
		if(pet instanceof Dog) {
			Dog dog = (Dog)pet;
			System.out.println("�޸�ǰ-----------");
			dog.showPet();
			dog.reSetPetColor(Color.yellow);
			System.out.println("�޸ĺ�-----------");
			dog.showPet();
		}else if(pet instanceof Cat) {
			Cat cat = (Cat)pet;
			System.out.println("�޸�ǰ-----------");
			cat.showPet();
			cat.reSetPetColor(Color.orange);
			System.out.println("�޸ĺ�-----------");
			cat.showPet();
		}
			
	}

}
