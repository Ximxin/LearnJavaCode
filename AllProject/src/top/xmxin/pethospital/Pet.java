package top.xmxin.pethospital;

public class Pet {
	@SuppressWarnings("unused")
	private String nickName;
	@SuppressWarnings("unused")
	private Gender gender;
	@SuppressWarnings("unused")
	private Color color;
	public Pet(String nickName, Gender gender, Color color) {
		this.nickName = nickName;
		this.gender = gender;
		this.color = color;
	}
	public void reSetPetColor(Color color) {
		this.color = color;
	}
	public void showPet() {
		System.out.println("�ǳ�:" + nickName);
		System.out.println("�Ա�:" + gender);
		System.out.println("��ɫ:" + color);
	}
	public void Shout() {
		System.out.println("�������~~~");
	}
	public String getNickName() {
		return nickName;
	}
}
