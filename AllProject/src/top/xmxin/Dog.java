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
		System.out.println(this.nickName + "的信息------------");
		System.out.println("狗的昵称: " + this.nickName);
		if(this.dogAge >= 0)
			System.out.println("狗的年龄: " + this.dogAge + "岁");
		else
			System.out.println("狗的年龄: 年龄不能为负！");
		System.out.println("喜欢的食物: " + this.likeFood);
		System.out.println("狗的性别: " + gender);
	}
	
	public void dogCalling() {
		System.out.println("----------");
		System.out.println("汪~~~");
	}
	
	public void eatLikeFood() {
		System.out.println("----------");
		System.out.println(this.nickName + "正在吃" + this.likeFood);
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public void setDogAge(int dogAge) {
		if(dogAge < 0) {
			System.out.println("年龄不能为负！");
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
