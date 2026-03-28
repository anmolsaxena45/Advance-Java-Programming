package Streamm;

import java.util.ArrayList;
import java.util.List;

class Employee1{
	int eid, salary;
	String name, dept;
	public Employee1(int eid, String name, int salary, String dept) {
		this.eid = eid;
		this.salary = salary;
		this.name = name;
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
}
public class SortedQ17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee1> List = new ArrayList<>();
		List.add(new Employee1(1, "Rahul", 20000, "IT" ));
		List.add(new Employee1(2, "Aman", 15000, "CS" ));
		List.add(new Employee1(3, "Ankit", 21000, "IT" ));
		List.add(new Employee1(4, "Raman", 13000, "ECE" ));
		List.add(new Employee1(5, "Rohit", 22000, "AI" ));
		
		List<Employee1> sortedList = List.stream()
				.sorted((e1, e2)->e1.getSalary()-e2.getSalary())
				.toList();
		System.out.println(sortedList);
		sortedList.forEach(System.out::println);
	}

}
