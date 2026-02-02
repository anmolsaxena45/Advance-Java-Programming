	//Write a Java program with method overloading where a class contains:
	//a method to add two integers
	//a method to add three integers
	//a method to add two double values
	//Call all methods using a single object.
	class OvrLoaded{
		void sum (int num1, int num2) {
			System.out.println(num1 + num2);
		}
		
		void sum (int num1, int num2, int num3) {
			System.out.println(num1 + num2 + num3);
		}
		
		void sum (double num1, double num2) {
			System.out.println(num1 + num2);
		}
	
	}
	public class FuncOverloading {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			OvrLoaded ol = new OvrLoaded();
			ol.sum(4,  6);
			ol.sum(5, 6, 8);
			ol.sum(3.56, 5);
		}
	
	}
