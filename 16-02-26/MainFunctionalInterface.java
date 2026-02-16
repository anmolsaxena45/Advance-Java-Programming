package FuncInterface;

@FunctionalInterface
//It has only one abstract method and is declared using "@FunctionalInterface" annotation(Extra info for compiler).


interface Add{
	int calculate(int n1, int n2);
	//int calculate(int n1, int n2, int n3);
	default void calculate(int n1, int n2, int n3) {
	}
	
	static void getInfo() {
		
	}
	
	private void getPrivateInfo() {
		
	}
}
public class MainFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a1 = new Add() {
			public int calculate(int n1, int n2) {
				return (n1+n2);
			}
		};
		System.out.println(a1.calculate(5, 7));
		
		//Lambda expression
		Add a2 = (int n1, int n2) -> (n1+n2);
		System.out.println(a2.calculate(9, 7)); //overrides abstract method i.e., calculate
		
	}

}