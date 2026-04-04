package StreamMinMax;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1
		List<Integer> Q1 = Arrays.asList(10, 20, 5, 40, 15);
		System.out.println("Q1: " + Q1);
		Optional<Integer> resQ1 = Q1.stream().min((a, b)-> a-b);
		resQ1.ifPresent(System.out::println);
		System.out.println();
		
		
		//Q2
		List<Integer> Q2 = Arrays.asList(10, 20, 10, 30, 20);
		System.out.println("Q2: " + Q2);
		Optional<Integer> resQ2 = Q2.stream().min((a, b)-> b-a);
		resQ2.ifPresent(System.out::println);
		System.out.println();
		
		//Q3
		List<Integer> Q3 = Arrays.asList(10, 20, 5, 40, 15,0,0,0,0,0,0);
		System.out.println("Q3: " + Q3);
		Optional<Integer> resQ3 = Q3.stream().min((a, b)-> b-a);
		resQ3.ifPresent(System.out::println);
		System.out.println();
		
		
		//Q4
		List<Integer> Q4 = Arrays.asList(10, 20, 5, 40, 15);
		System.out.println("Q4: " + Q4);
		List<Integer> resQ4 = Q4.stream().limit(4).toList();
		System.out.println(resQ4);
		System.out.println();
		
		
		//Q5
		List<Integer> Q5 = Arrays.asList(10, 20, 5, 40, 15);
		System.out.println("Q5: " + Q5);
		List<Integer> resQ5 = Q5.stream().skip(3).toList();
		System.out.println(resQ5);
		System.out.println();
		
		
		//Q6
		List<Integer> Q6 = Arrays.asList(10, 20, 5, 40, 15);
		System.out.println("Q6: " + Q6);
		List<Integer> resQ6 = Q6.stream().sorted().toList();
		System.out.println(resQ6.get(1));
		System.out.println();
		
		
		//Q7
		List<Integer> Q7 = Arrays.asList(10, 20, 5, 40, 15);
		System.out.println("Q7: " + Q7);
		List<Integer> resQ7 = Q7.stream().sorted((a,b)-> b-a).toList();
		System.out.println(resQ7.get(1));
		System.out.println();
		
		//Q8
		List<Integer> Q8 = Arrays.asList(10, 20, 5, 40, 15);
		System.out.println("Q8: " + Q8);
		Q8.stream().sorted((a,b)->b-a).limit(3).toList().forEach(n->System.out.print(n + " "));
		System.out.println("\n");
		
		//Q9
		List<Integer> Q9 = Arrays.asList(10, 20, 5, 40, 15);
		System.out.println("Q9: " + Q9);
		Q9.stream().sorted().limit(3).toList().forEach(n->System.out.print(n + " "));
		System.out.println("\n");
		
		//Q10
		List<Integer> Q10 = Arrays.asList(10, 20, 20, 30, 40, 40, 50);
		System.out.println("Q10: " + Q10);
		System.out.println(Q10.stream().distinct().sorted().min((a,b)->b-a));
		System.out.println("\n");
		
		//Q11
		List<Integer> Q11 = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40, 45);
		System.out.println("Q11: " + Q11);
		Q11.stream().skip(5).limit(3).forEach(n->System.out.print(n + " "));
		System.out.println("\n");
		
		//Q12
		List<String> Q12 = Arrays.asList("Ram", "Shyam", "Amit", "Zoya", "Ravi");
		System.out.println("Q12: " + Q12);
		String min = Q12.stream()
		        .min(String::compareTo)
		        .get();
		System.out.println(min);
		System.out.println("\n");
		
		//Q13
		List<String> Q13 = Arrays.asList("Ram", "Shyam", "Amit", "Zoya", "Ravi");
		System.out.println("Q13: " + Q13);
		System.out.println(Q13.stream().max(String::compareTo).get());
		System.out.println("\n");
		
		//Q14
		List<String> Q14 = Arrays.asList("Ram", "Shyam", "Ram", "Zoya", "Ravi");
		System.out.println("Q14: " + Q14);
		Q14.stream().distinct().forEach(n->System.out.print(n + " "));
		System.out.println("\n");
		
		//Q15
		List<String> Q15 = Arrays.asList("Ram", "Shyam", "Ram", "Zoya", "Ravi", "Ram", "Shyam", "Ram", "Zoya", "Ravi");
		System.out.println("Q15: " + Q15);
		Q15.stream().limit(5).forEach(n->System.out.print(n + " "));
		System.out.println("\n");
		
		//Q16
		List<String> Q16 = Arrays.asList("Ram", "Shyam", "Ram", "Zoya", "Ravi");
		System.out.println("Q16: " + Q16);
		Q16.stream().skip(2).forEach(n->System.out.print(n + " "));
		System.out.println("\n");
	}

}
