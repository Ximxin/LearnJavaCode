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
		System.out.println("昵称:" + nickName);
		System.out.println("性别:" + gender);
		System.out.println("颜色:" + color);
	}
	public void Shout() {
		System.out.println("宠物叫声~~~");
	}
	public String getNickName() {
		return nickName;
	}
}
