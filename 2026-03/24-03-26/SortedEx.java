package Streamm;

import java.util.Arrays;
import java.util.List;
//import java.util.Comparator;
//int compare(T o1, To2);


public class SortedEx {

	public static void main(String[] args) {
		// TODO .sorted() implementation
		//Q1
		List<Integer> listQ1 = Arrays.asList(23, 12, 1, 45, 23, 76, 26, 91);
		System.out.println(listQ1);
		List <Integer> sortedListQ1 = listQ1.stream().sorted((a, b) -> a-b).toList();
		//List <Integer> sortedListASC = list.stream().sorted().toList();
		System.out.println(sortedListQ1);
		
		
		//Q2
		List<Integer> listQ2 = Arrays.asList(23, 12, 1, 45, 23, 76, 26, 91);
		List <Integer> sortedListQ2 = listQ2.stream().sorted((a, b)->b-a).toList();
		//List <Integer> sortedList = list.stream().sorted(comparator.reverseOrder()).toList();
		System.out.println(sortedListQ2);
		
		
		//Q3
		List<Integer> listQ3 = Arrays.asList(23, 12, 1, 45, 23, 76, 26, 91);
		List <Integer> sortedListQ3 = listQ3.stream().sorted((a, b)-> b-a).limit(3).toList();
		System.out.println(sortedListQ3);
		
		
		//Q4
		List<Integer> listQ4 = Arrays.asList(23, 12, 1, 45, 23, 76, 26, 91);
		List <Integer> sortedListQ4 = listQ4.stream().sorted().filter(n-> n%2 == 0).toList();
		System.out.println(sortedListQ4);
		
		
		//Q6
		List<Integer> listQ6 = Arrays.asList(23, 12, 1, 45, 23, 76, 26, 91);
		List <Integer> sortedListQ6 = listQ6.stream().sorted().distinct().toList();
		System.out.println(sortedListQ6);
		
		
		//Q7
		List<Integer> listQ7 = Arrays.asList(23, 12, 1, 45, 23, 76, 26, 91);
		int sortedListQ7 = listQ7.stream().sorted((a,b)->b-a).toList().get(1);
		System.out.println(sortedListQ7);
		
		//Q8
		List<Integer> listQ8 = Arrays.asList(23, 12, 1, 45, 23, 76, 26, 91);
		List <Integer> sortedListQ8 = listQ8.stream().sorted().filter(n-> n>20).toList();
		System.out.println(sortedListQ8);
		
		
		//Q10
		List<String> namesQ10 = Arrays.asList("Ravi", "Ankit", "Zoya", "Meena", "Kunal");
		List<String> sortedNamesQ10 = namesQ10.stream().sorted().toList();
		System.out.println(sortedNamesQ10);
		
		
		//Q11
		List<String> namesQ11 = Arrays.asList("Ravi", "Ankit", "Zoya", "Meena", "Kunal");
		List<String> sortedNamesQ11 = namesQ11.stream().sorted((a, b)-> b.compareTo(a)).toList();
		System.out.println(sortedNamesQ11);
		
		
		//Q12
		List<String> namesQ12 = Arrays.asList("Ravi", "Ankit", "Zoya", "Meena", "Kunal");
		List<String> sortedNamesQ12 = namesQ12.stream().sorted((a, b)-> a.length()-b.length()).toList();
		System.out.println(sortedNamesQ12);
		
		
		//Q13
		List<Integer> listQ13 = Arrays.asList(25, 14, 50, 33, 45, 18, 60);
		listQ13.stream().filter(n-> n%5 == 0).sorted().forEach(System.out::println);
		
		
		//Q14
		List<Integer> listQ14 = Arrays.asList(39, 7, 22, 15, 3, 41);
		List <Integer> sortedListQ14 = listQ14.stream().sorted().toList();
		System.out.println(sortedListQ14.get(0));
		
		
		//Q15
		List<Integer> listQ15 = Arrays.asList(5, 28, 16, 42, 11, 63, 9);
		List <Integer> sortedListQ15 = listQ15.stream().sorted((a,b)->b-a).limit(2).toList();
		System.out.println(sortedListQ15);
		
		
		//Q16
		List<Integer> listQ16 = Arrays.asList(3, 18, 55, 42, 27, 9, 61, 14);
		List <Integer> sortedListQ16 = listQ16.stream().filter(n->n>=10 && n<=50).sorted((a,b)->a-b).toList();
		System.out.println(sortedListQ16);
		
		
	}

}
