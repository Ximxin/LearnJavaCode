package top.xmxin.pethospital;

public class Cat extends Pet {

	public Cat(String nickName, Gender gender, Color color) {
		super(nickName, gender, color);
	}

	@Override
	public void Shout() {
		System.out.println(getNickName() + ": ίχ~~~");
	}
	
}
