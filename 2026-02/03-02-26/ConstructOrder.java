package Inherit;

interface Shape{
	int area(int side);
}

class Square implements Shape{
	public int area(int side) {
		return (side * side);
	}
	void display(int side) {
		System.out.println(area(side));
	}
	static void shape(String shapeName) {
		System.out.println(shapeName);
	}
}
public class ConstructOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Square();
		//s.display() //method undefined
		
		Square s1 = null;
		s1.shape("Square");
	}

}
