package Streamm;

import java.util.ArrayList;

class StudentQ16{
	private int sId;
	private String name;
	private int marks;
	public StudentQ16(int sId, String name, int marks) {
		super();
		this.sId = sId;
		this.name = name;
		this.marks = marks;
	}
	
	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String toString() {
		return "Student [sId: "+ sId + ", name: " + name + ", marks: " + marks + "]";
	}
}
public class MainAssignmentQ16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentQ16> list = new ArrayList<StudentQ16>();
		list.add(new StudentQ16(1, "Anmol", 84));
		list.add(new StudentQ16(2, "Aman", 65));
		list.add(new StudentQ16(3, "Adnan", 61));
		list.add(new StudentQ16(4, "Anmol Chopra", 45));
		list.add(new StudentQ16(5, "Akhilesh", 44));
		System.out.println("\tsId\t\tName\t\tMarks");
		
		list.stream()
		.filter(student-> student.getMarks()>60)
		.forEach(student->{
			String result = String.format("\t%d\t\t%s\t\t%d", student.getsId(), student.getName(), student.getMarks());
			System.out.println(result);
		});
	}

}
