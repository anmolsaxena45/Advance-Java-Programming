//Interface reference + polymorphism + visibility trap

//Create an interface Shape with method area().
//Implement it in class Square.
//Add one extra method in Square.
//Use an interface reference to call methods and:
//observe which calls work
//which fail
//fix the failure without changing the interface



interface Shape{
	void area ();
}

class Square implements Shape{
	double s, area;
	Square(double s){
		this.s = s;
	}
	public void area() {
		area = s*s;
	}
	
	void displayArea() {
		System.out.println(area);
	}
}
public class AreaMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1 = new Square(5.0);
		s1.area();
		s1.displayArea();
		
		Shape s2 = new Square(4.0);
		s2.area();
		//s2.displayArea(); //compile time err
		
		
		//down-casting
		
		Square s3 = (Square) s1;
		s3.displayArea();
		
		//anonymous class
		Shape s4 = new Shape() {
			public void area () {
				int s=3;
				System.out.println(s*s);
			}
			
			public void display() {
				System.out.println("Square");
			}
		};
		s4.area();
		//s4.display(); //compile time err, undefined method
	}

}
