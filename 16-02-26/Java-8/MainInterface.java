//Problem faced: method in an interface needed to be incremented;
//Solution: **default** method with it's definition can be used - Any no. of default method can be defined 
//- it can be overloaded & overridden as well

//default method : In Java 8 and later, a default method in an interface is a method that has a body (implementation) inside the interface itself.
//It is declared using the default keyword.
package Java8;
interface Calc{
	void calculate (int n1, int n2);
	default void calculate(int n1, int n2, int n3) {
		int s = n1+n2+n3;
		//System.out.println("Sum = " + s);
		getPrivateInfo("Sum =" + s);
	}
	static String getInfo() {
		return "This is getInfo method";
	}
	//Personal method of Interface itself. 
	private void getPrivateInfo(String msg) {
		System.out.println(msg);
	}
}

class Sum implements Calc{
	public void calculate(int n1, int n2) {
		int s = n1+n2;
		System.out.println("Sum = " + s);
	}
	
	public void calculate(int n1, int n2, int n3) {
		int s = n1+n2+n3;
		System.out.println("Sum of 3 no.s = " + s);
	}
}
public class MainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s1 = new Sum();
		s1.calculate(2, 4);
		s1.calculate(2, 4, 5);
		System.out.println(Calc.getInfo());
	}

}