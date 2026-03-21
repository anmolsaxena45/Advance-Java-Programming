package Streamm;

import java.util.Arrays;
import java.util.List;

public class MainMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> numbers = Arrays.asList(23, 32, 45, 35, 67, 89, 95);
		System.out.println(numbers);
		List <Integer> result = numbers.stream().filter(n->n<40).map(n->n+8).toList();
		System.out.println(result);
		
		System.out.println();System.out.println();System.out.println();System.out.println();
		
		List <String> namesQ1 = Arrays.asList("sachin", "amit", "rahul");
		System.out.println(namesQ1);
		List<String> Q1 = namesQ1.stream().map(n->n.toUpperCase()).toList();
		System.out.println(Q1);
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		List <Integer> numbersQ2 = Arrays.asList(1, 2, 3, 4);
		System.out.println(numbersQ2);
		List <Integer> Q2 = numbersQ2.stream().map(n->n*n).toList();
		System.out.println(Q2);
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		List <String> namesQ3 = Arrays.asList("Java", "Python", "C");
		System.out.println(namesQ3);
		List<Character> Q3 = namesQ3.stream().map(n->n.charAt(0)).toList();
		System.out.println(Q3);
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		List <Integer> numbersQ4 = Arrays.asList(10, 20, 30);
		System.out.println(numbersQ4);
		List <String> Q4 = numbersQ4.stream().map(String::valueOf).toList();
		System.out.println(Q4);
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		List <String> namesQ5 = Arrays.asList("A", "B", "C");
		System.out.println(namesQ5);
		List<String> Q5 = namesQ5.stream().map(n->"item-"+n).toList();
		System.out.println(Q5);
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		List<String> namesQ6 = Arrays.asList("Java", "Stream", "API");
		System.out.println(namesQ6);
		List <Integer> Q6 = namesQ6.stream().map(n-> n.length()).toList();
		System.out.println(Q6);
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		List <Integer> numbersQ8 = Arrays.asList(5, 10, 15);
		System.out.println(numbersQ8);
		List <Integer> Q8 = numbersQ8.stream().map(n-> n*2).toList();
		System.out.println(Q8);
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		List<String> namesQ9 = Arrays.asList("1", "2", "3");
		System.out.println(namesQ9);
		List <Integer> Q9 = namesQ9.stream().map(n-> Integer.parseInt(n)).toList();
		System.out.println(Q9);
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		List<String> namesQ10 = Arrays.asList(" Java ", " Python ", " C++ ");
		System.out.println(namesQ10);
		List <String> Q10 = namesQ10.stream().map(n-> n.trim()).toList();
		System.out.println(Q10);
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		List<Double> namesQ11 = Arrays.asList(0.0, 20.0, 30.0);
		System.out.println(namesQ11);
		List <Double> Q11 = namesQ11.stream().map(n-> (n*1.8)+32).toList();
		System.out.println(Q11);
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		List<String> namesQ12 = Arrays.asList("Java", "Code");
		System.out.println(namesQ12);
		List <Character> Q12 = namesQ12.stream().map(n-> n.charAt(n.length()-1)).toList();
		System.out.println(Q12);
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		List<String> namesQ13 = Arrays.asList("Java", "Python");
		System.out.println(namesQ13);
		List<Integer> Q13 = namesQ13.stream().map(n-> n.hashCode()).toList();
		System.out.println(Q13);
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		
		List<String> namesQ14 = Arrays.asList("Java", "Python");
		System.out.println(namesQ14);
		List <String> Q14 = namesQ14.stream().map(n-> n.concat("-" + n.length())).toList();
		System.out.println(Q14);
		
		System.out.println();System.out.println();System.out.println();System.out.println();

		List<Integer> namesQ15 = Arrays.asList(1, 2, 3, 4);
		System.out.println(namesQ15);
		List <Boolean> Q15 = namesQ15.stream().map(n-> n%2 == 0? true : false).toList();
		System.out.println(Q15);
		
	}

}
