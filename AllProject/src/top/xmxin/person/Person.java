package top.xmxin.person;

public class Person {
	private String name;
	private int age;
	private int height;
	private int weight;
	private String gender;
	private String likeFood;
	
	public Person() {}
	
	public Person CreatePerson() {
		Person person = new Person();
		return person;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if( name.equals("")) {
			System.out.println("姓名不能为空！");
			return;
		}
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("年龄不能为负！");
			return;
		}
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if(height < 0) {
			System.out.println("身高不能为负！");
			return;
		}
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight < 0) {
			System.out.println("体重不能为负！");
			return;
		}
		this.weight = weight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLikeFood() {
		return likeFood;
	}
	public void setLikeFood(String likeFood) {
		this.likeFood = likeFood;
	}
	
}
