package top.xmxin.person;
public class Student extends Person {
	private String studentID;
	private int classRoom;
	public Student() {}
	public void showInfo() {
		System.out.println(getName() + "的学生信息----------");
		System.out.println("姓名: " + getName());
		System.out.println("年龄: " + getAge());
		System.out.println("性别: " + getGender());
		System.out.println("喜欢的食物: " + getLikeFood());
		System.out.println("学生号: " + studentID);
		System.out.println("班级: " + classRoom);
		
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
}
