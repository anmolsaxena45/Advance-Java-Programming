package Streamm;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FilterAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList(23, 56, 23, 45, 67,98, 109);
		ArrayList <Integer> list = new ArrayList<>();
		list.add(23);
		list.add(45);
		list.addAll(List.of(23, 56, 78, 23, 45, 67));
		list.addAll(data);
//		System.out.println("list: "+list);
		
		//Stream streamList = list.stream();
//		list.stream().filter((n)->n>60).forEach((n)-> System.out.print(n + " "));
//		List <Integer> g60 = list.stream().filter((n)->n>60 && n<90).toList();
//		System.out.println();
//		System.out.println("Elements greater than 60 in list are : " + g60);
		
		
		ArrayList <Integer> Q1 = new ArrayList<>();
		Q1.addAll(List.of(10, 15, 20, 25, 30, 11, 17, 16));
		System.out.println("list-1: "+ Q1);
		Q1.stream().filter((n)-> n%2==0).forEach((n)->System.out.print(n+" "));
		
		
		System.out.println();System.out.println();System.out.println();System.out.println();
		
		
		ArrayList <String> Q2 = new ArrayList<>();
		Q2.addAll(List.of("Amit", "Ravi", "Anil", "Vikas", "Ashok", "Rahul"));
		System.out.println("list-2: "+ Q2);
		Q2.stream().filter((n)-> n.charAt(0)=='A').forEach((n)->System.out.print(n+" "));

		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		ArrayList <Integer> Q3 = new ArrayList<>();
		Q3.addAll(List.of(10, 60, 45, 90, 30, 24, 50, 76));
		System.out.println("list-3: "+ Q3);
		Q3.stream().filter((n)-> n>50).forEach((n)->System.out.print(n+" "));	
		
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		ArrayList <String> Q4 = new ArrayList<>();
		Q4.addAll(List.of("Java", "Python", "C", "React", "C#", "Next.js", "Node.js"));
		System.out.println("list-4: "+ Q4);
		Q4.stream().filter((n)-> n.length()>4).forEach((n)->System.out.print(n+" "));
		
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		List<String> nullList = Arrays.asList("Java", null, "Spring", null, "React");
		ArrayList <String> Q5 = new ArrayList<>();
		Q5.addAll(nullList);
		System.out.println("list-5: "+ Q5);
		List <String> notNullList = Q5.stream().filter((n)-> n != null).toList();
		System.out.println("Not Null List : " + notNullList);
		
		
		System.out.println();System.out.println();System.out.println();System.out.println();
		
		
		ArrayList <Integer> Q6 = new ArrayList<>();
		Q6.addAll(List.of(3, 4, 7, 8, 9, 1, 5, 4, 16));
		System.out.println("list-6: "+ Q6);
		Q6.stream().filter((n)-> n%2!=0).forEach((n)->System.out.print(n+" "));
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		ArrayList <Integer> Q7 = new ArrayList<>();
		Q7.addAll(List.of(10, 12, 15, 22, 25, 36, 75));
		System.out.println("list-7: "+ Q7);
		Q7.stream().filter((n)-> n%5==0).forEach((n)->System.out.print(n+" "));
		
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		ArrayList <String> Q8 = new ArrayList<>();
		Q8.addAll(List.of("Java", "", "Spring", "", "AI"));
		System.out.println("list-8: "+ Q8);
		List <String> noEmpList = Q8.stream().filter((n)-> n != "").toList();
		System.out.println("List (No empty): " + noEmpList);
		
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		ArrayList <Integer> Q9 = new ArrayList<>();
		Q9.addAll(List.of(10, 15, 20, 25, 30, 11, 17, 16));
		System.out.println("list-9: "+ Q9);
		Q9.stream().filter((n)-> n>=20 && n<=50).forEach((n)->System.out.print(n+" "));
		
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		ArrayList <Integer> Q13 = new ArrayList<>();
		Q13.addAll(List.of(10, 15, 20, 25, 30, 11, 17, 16));
		System.out.println("list-13: "+ Q13);
		Q13.stream().distinct().filter((n)-> n>15).forEach((n)->System.out.print(n+" "));
		
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		
		ArrayList <String> Q14 = new ArrayList<>();
		Q14.addAll(List.of("Java", "Python", "C", "React", "C#", "Next.js", "Node.js"));
		System.out.println("list-14: "+ Q14);
		Q14.stream().filter((n)-> n.length()>4).forEach((n)->System.out.print(n+" "));
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		
	}
}
