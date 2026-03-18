package SealedClas;
sealed class Shape permits Circle, Rectangle{
	
}
//Non-permissible class cannot extend the sealed class as it is not a permitted sub-type of Shape
final class Circle extends Shape{
	
}

non-sealed class Rectangle extends Shape{
	
}

public class MainSealed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
