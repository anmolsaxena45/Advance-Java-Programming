package Streamm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReduceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		//Q1
		int sum = list.stream().reduce(0,  (a, b)-> a+b);
		System.out.println("Sum = " + sum);
		
		//Q2
		int prod = list.stream().reduce(1,  (a, b)-> a*b);
		System.out.println("Product = " + prod);
		System.out.println("Avg = " + (double)sum/list.size());
		
		//Q3
		List <Integer> listQ3 = Arrays.asList(12, 45, 7, 89, 23, 56);
		System.out.println(listQ3);
		int Q3 = listQ3.stream().reduce(0,  (a, b)-> a>b?  a: b);
		System.out.println("Max = " + Q3);
		
		//Q4
				List <Integer> listQ4 = Arrays.asList(12, 45, 7, 89, 23, 56);
				System.out.println(listQ4);
				int Q4 = listQ4.stream().reduce(12,  (a, b)-> a>b?  b: a);
				System.out.println("Min = " + Q4);
		
				
				//Q5
				List <Integer> listQ5 = Arrays.asList(12, 45, 7, 89, 23, 56);
				System.out.println(listQ5);
				int Q5 = listQ4.stream().reduce(0,  (a, b)-> a+1);
				System.out.println("Count = " + Q5);
				
				//Q6
				List <Integer> listQ6 = Arrays.asList(12, 45, 7, 89, 23, 56);
				System.out.println(listQ6);
				int Q6 = listQ5.stream().filter(n->n%2==0).reduce(0,  (a, b)-> a+b);
				System.out.println("Sum of even numbers = " + Q6);
				
				
				//Q7
				List <String> listQ7 = Arrays.asList("Java", "Stream", "API", "Reduce");
				System.out.println(listQ7);
				String Q7 = listQ7.stream().reduce("",  (a, b)-> a+" "+b);
				System.out.println("String = " + Q7);
				
				
				//Q8
				List <Integer> listQ8 = Arrays.asList(1, 2,3 ,4, 5);
				System.out.println(listQ8);
				int Q8 = listQ8.stream().reduce(0,  (a, b)-> a+(b*b));
				System.out.println("Sum of squares = " + Q8);
				
				
				//Q9
				List <Integer> listQ9 = Arrays.asList(12, 45, 67, 23, 89, 34, 78);
				System.out.println(listQ9);
				int Q9 = listQ9.stream().reduce(0,  (a, b)-> a>b? a : b);
				int Smax = listQ9.stream().reduce(0,  (a, b)-> a>b && a<Q9? a : b);
				System.out.println("Second max = " + Smax);
				
				int min = listQ9.stream().reduce(12,  (a, b)-> a<b? a : b);
				int Smin = listQ9.stream().reduce(12,  (a, b)-> a<b && a>min? a : b);
				System.out.println("Second min = " + Smin);
				
				//Q10
				List <String> listQ10 = Arrays.asList("Java", "Programming", "Stream", "API", "Functional");
				System.out.println(listQ10);
				String Q10 = listQ10.stream().reduce("",  (a, b)-> a.length()>b.length()? a : b);
				System.out.println("Longest string = " + Q10);
				
				
				//Q11 - average
				
				//Q12
				List <Integer> listQ12 = Arrays.asList(12, 34, 56, 78);
				System.out.println(listQ12);
				int Q12 = listQ12.stream().reduce(0,  (a, b)-> a+(b%10) + (b-(b%10))/10);
				System.out.println("Sum of digits = " + Q12);
				

//				int a = 123456;
//				int res = String.valueOf(a).chars().map(c-> c- '0').reduce(0, (a, b)->a+b);
//				System.out.println("Sum of " + a + " = " + res);
				
				//Q13 - find factorial;
				int n = 5;
				
				int fact = IntStream.rangeClosed(1, n).reduce(1, (a, b)-> a*b);
				System.out.println("fact of " + n + " = " + fact);
				
				
				//Q14
				List <Integer> listQ14 = Arrays.asList(10, 20, 10, 30, 20, 40, 50);
				System.out.println(listQ14);
				int Q14 = listQ14.stream().distinct().reduce(0,  (a, b)-> a+b);
				System.out.println("Sum of distinct digits = " + Q14);
				
				
				//Q15
				List <String> listQ15 = Arrays.asList("Java", "Programming", "Stream", "API", "Functional");
				System.out.println(listQ10);
				String Q15 = listQ15.stream().map(String::toUpperCase).reduce("",  (a, b)-> a+b);
				System.out.println("Uppercase Concatenated String = " + Q15);
		
	}
}
