package top.xmxin;

public class Dog {
	private String nickName;
	private int dogAge;
	private String likeFood;
	private Gender gender;
	private Dog() {}
	
	public static Dog newDog() {
		Dog dog = new Dog();
		return dog;
	}
	
	public void showInfo() {
		System.out.println(this.nickName + "����Ϣ------------");
		System.out.println("�����ǳ�: " + this.nickName);
		if(this.dogAge >= 0)
			System.out.println("��������: " + this.dogAge + "��");
		else
			System.out.println("��������: ���䲻��Ϊ����");
		System.out.println("ϲ����ʳ��: " + this.likeFood);
		System.out.println("�����Ա�: " + gender);
	}
	
	public void dogCalling() {
		System.out.println("----------");
		System.out.println("��~~~");
	}
	
	public void eatLikeFood() {
		System.out.println("----------");
		System.out.println(this.nickName + "���ڳ�" + this.likeFood);
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public void setDogAge(int dogAge) {
		if(dogAge < 0) {
			System.out.println("���䲻��Ϊ����");
			return;
		}
		this.dogAge = dogAge;
	}
	public void setLikeFood(String likeFood) {
		this.likeFood = likeFood;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
