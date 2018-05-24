package top.xmxin.pethospital;

public class Dog extends Pet {
	public Dog(String nickName, Gender gender, Color color) {
		super(nickName, gender, color);
	}

	@Override
	public void Shout() {
		System.out.println(getNickName() + ": Íô~~~");
	}
	
}
