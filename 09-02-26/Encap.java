package Encapsulate;
class Student{
	private String name, course;
	private int sid;
	
	public Student(String name, String course, int sid) {
		super();
		this.name = name;
		this.course = course;
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}
	
}
public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Anmol", "MCA", 36);
		System.out.println("sID : " + s1.getSid());
		System.out.println("Name : " + s1.getName());
		System.out.println("Course : " + s1.getCourse());
		
		s1.setSid(5);
		System.out.println("sID : " + s1.getSid());
	}

}
