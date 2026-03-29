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
	}

}
