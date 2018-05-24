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
			System.out.println("��������Ϊ�գ�");
			return;
		}
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("���䲻��Ϊ����");
			return;
		}
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if(height < 0) {
			System.out.println("��߲���Ϊ����");
			return;
		}
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight < 0) {
			System.out.println("���ز���Ϊ����");
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
