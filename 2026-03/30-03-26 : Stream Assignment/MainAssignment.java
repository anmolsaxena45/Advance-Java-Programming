package StreamAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1
		//Q2
		//Q3
		//Q4
		
		//Q5
		List <Integer> listQ5 = Arrays.asList(10, 50, 30, 20, 60, 40, 70);
		System.out.println(listQ5);
		List <Integer> resultQ5 = listQ5.stream().sorted((a,b)-> b-a).skip(2).toList();
		System.out.println("List after deleting largest 2 element: "+resultQ5 + "\n");
		
		//Q6
		
		//Q7
		List <Integer> listQ7 = Arrays.asList(5, 15, 25, 35, 45, 20, 10);
		System.out.println(listQ7);
		Integer resultQ7= listQ7.stream().filter(n-> n>=10 && n<=40).reduce(0, (a,b)-> a+b);
		System.out.println("Sum b/w 10 to 40: " + resultQ7 + "\n");
		
		//Q8
		List <Integer> listQ8 = Arrays.asList(5, 15, 25, 35, 45, 20, 10);
		System.out.println(listQ8);
		Integer resultQ8= listQ8.stream().sorted((a,b)->b-a).toList().get(2);
		System.out.println("Sum b/w 10 to 40: " + resultQ8 + "\n");
		
		//Q9
//		List <Integer> listQ9 = Arrays.asList(5, 15, 25, 35, 45, 20, 10);
//		System.out.println(listQ9);
//		Stream<Integer> resultQ9= listQ9.stream().sorted((a,b)-> b-a);
//		System.out.println("Sum b/w 10 to 40: " + resultQ9 + "\n");
		
		//Q10
		//Q11
		
		//Q12
		List <Integer> listQ12 = Arrays.asList(5, 15, 25, 35, 45, 20, 10);
		System.out.println(listQ12);
		Integer resultQ12= listQ12.stream().sorted((a,b)->a-b).filter(n->n%2!=0 && n>20).toList().get(0);
		System.out.println("Smallest odd number greater than 20: " + resultQ12 + "\n");
		
		//Q13
		List <Integer> listQ13 = Arrays.asList(2, 6, 3, 8, 4, 10);
		System.out.println(listQ13);
		Integer resultQ13 = listQ13.stream().filter(n->n>5).reduce(1, (a,b)-> a*b);
		System.out.println("Product of all number greater than 5: " + resultQ13 + "\n");
		
		//Q14
		List <Integer> listQ14 = Arrays.asList(2, 6, 3, 8, 4, 10);
		System.out.println(listQ14);
		Integer resultQ14 = listQ14.stream().sorted().skip(2).toList().get(0);
		System.out.println("Min element after first 2 element: " + resultQ14 + "\n");
		
		//Q15
		
		//Q16
		List <Integer> listQ16 = Arrays.asList(10, 15, 22, 30, 17, 42, 8);
		System.out.println(listQ16);
		Integer resultQ16 = listQ16.stream().sorted((a,b)-> b-a).filter(n->n%2==0).limit(4).reduce(0, (a,b)->a+b);
		System.out.println("Sum of top 4 even element: " + resultQ16 + "\n");
	}

}
