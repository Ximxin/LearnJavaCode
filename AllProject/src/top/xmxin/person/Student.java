package top.xmxin.person;
public class Student extends Person {
	private String studentID;
	private int classRoom;
	public Student() {}
	public void showInfo() {
		System.out.println(getName() + "��ѧ����Ϣ----------");
		System.out.println("����: " + getName());
		System.out.println("����: " + getAge());
		System.out.println("�Ա�: " + getGender());
		System.out.println("ϲ����ʳ��: " + getLikeFood());
		System.out.println("ѧ����: " + studentID);
		System.out.println("�༶: " + classRoom);
		
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
