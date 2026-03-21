package Streamm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	public String name;
	public Student (String name) {
		this.name = name;
	}
	
	 @Override
	    public String toString(){
		return "Student (name: " + name + ")";
	}
}

class StudentDTO{
	public String name;
	public StudentDTO (String name) {
		this.name = name;
	}
	
	public String toString() {
		return "StudentDTO (name: " + name + ")";
	}
}
public class MainMapQ16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> names = Arrays.asList(new Student("Ankit"), new Student("Amit"));
		System.out.println(names);
		
		List<StudentDTO> result = names.stream().map(s-> new StudentDTO(s.name)).collect(Collectors.toList());
		System.out.println(result/*.size()*/);
	}

}
