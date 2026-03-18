package FuncInterface;

class VoterList{
	void chk(int ageVal) {
		if(ageVal >= 18) System.out.println("You can Vote!");
		else System.out.println("You cannot vote!");
	}
}

@FunctionalInterface
//It has only one abstract method and is declared using "@FunctionalInterface" annotation(Extra info for compiler).
interface Add{
	//void calculate();
	//int square(int n);
	void check(int age);
	//int calculate(int n1, int n2);
	//int calculate(int n1, int n2, int n3);
	default void calculate(int n1, int n2, int n3) {
		getPrivateInfo();
	}
	
	static void getInfo() {
	}
	
	private void getPrivateInfo() {
		
	}
}
public class MainFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Add a1 = new Add() {
//			public int calculate(int n1, int n2) {
//				return (n1+n2);
//			}
//		};
//		System.out.println(a1.calculate(5, 7));
		
		
		
		//Lambda expression
		//Short form of creating anonymous function, that reference is pass to the functional Interface object
		//Block of code that can take parameters and return a value;
		//It is method without name
		
		
//		Add a2 = (int n1, int n2) -> (n1+n2);
//		System.out.println(a2.calculate(9, 7)); //overrides abstract method i.e., calculate
//		Add a3 = () -> System.out.println("Lambda Expression");
//		a3.calculate();
//		
//		Add a4 = () -> {
//			int n1 = 10, n2 = 3;
//			System.out.println("Sum = " + (n1+n2));
//		};
//		a4.calculate();
		
//		Add a5 = (int n1, int n2) -> n1+n2;
//		System.out.println(a5.calculate(5, 4));
		
//		Add a6 = n -> n*n;
//		System.out.println("Sq. of number = " + a6.square(5));
		
		Add a7 = age -> {
			if(age >= 18) System.out.println("You can Vote");
			else System.out.println("You cannot vote");
		};
		a7.check(17);
		
		VoterList v1 = new VoterList();
		Add a8 = v1::chk;//Method referencing //:: - Scope Resolution operator used for method referencing in Java, 
		//It passes reference of a method in class to method of Interface if signature is same
		a8.check(18);
		
		
		
		
		
//		Types of Lambda expression
//		1. No Parameter, no return type:
//            a. Multiple lines in function
//			   () -> {}
//			b. Single line representation
//			   () -> System.out.println("Lambda Expression")
//		2. No Parameter, with return type:
//			a. //multiple lines
//			     () -> {
//				//body
//				return 0;} 
//			b. Single line
//			     () -> 10;
//		3. With Parameter, No Return Type:
//			  a. With one Parameter 
//			     (int num1) -> System.out.println(num1) //With one parameter & data type
//			     (num1) -> System.out.println(num1) //With one parameter & without data type
//			     num1-> System.out.println(num1)
//			     num1 -> {
//			    	 System.out.println("Multiple lines");
//			    	 System.out.println(num1)
//			     }
//			     
//		4. With Parameter, With Return Type:
//			(int num1, int num2) -> num1+num2
//			(int num1, int num2) -> {return num1+num2}
		
	}

}