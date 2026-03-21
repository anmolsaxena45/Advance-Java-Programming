package Streamm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee{
	int eid;
	String name;
	String dept;
	public Employee(int eid, String name, String dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.dept = dept;
	}
	
	@Override
    public String toString() {
        return "Employee [eid=" + eid + ", name=" + name + ", dept=" + dept + "]";
}
}
public class MainMapQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Ankit", "MCA"));
		list.add(new Employee(2, "Rahul", "CSE"));
		System.out.println(list);
		List<String> empNames = list.stream().map(emp->emp.name).toList();
		System.out.println(empNames);
	}

}
