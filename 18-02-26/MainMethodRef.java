package MethodRef;
class Calculator{
	Calculator(){
		System.out.println("This is a Constructor");
	}
	
	Calculator(int n1, int n2){
		System.out.println("Div = " + n1/n2);
	}
	int sub (int n1, int n2) {
		return n1-n2;
	}
	
	static int mul (int n1, int n2) {
		return n1*n2;
	}
}
@FunctionalInterface
interface Calc{
	void cal(int n1, int n2);
}
public class MainMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		int s = c.sub(100, 25);
		System.out.println("Sub = " + s);
		
		//Method Referencing
//		Calc c1 = c::sub;
//		int s1 = c1.cal(1000,  25);
//		System.out.println("Sub = " + s1);
		
		
		//Static Method - Method Referencing (Static method should be accessed in static way, i.e., Class.staticMethod())
//		Calc c2 = Calculator::mul;
//		int m1 = c2.cal(1000,  25);
//		System.out.println("Mul = " + m1);
		
		//Constructor - Method Referencing (Signature won't match)
		//Only works if method of interface has no return type
		Calc c3 = Calculator::new;
		c3.cal(4, 2);
	}

}
