interface Area{//template for classes
	double PI = 3.14; //implicitly public static final; cannot be assigned, Initialized immediately 
	double getArea();
}

//A concrete class implementing an interface must implement all abstract methods.
class Circle implements Area{
	double r;
	Circle(double r){
		this.r = r;
	}
	//Overriding method cannot reduce visibility, access:public
	public double getArea() {
		return (PI * r * r);
		//compiled as Area.PI * r * r, PI is static final, single shared copy & constant
	}
	
	public void displayArea() {
		System.out.println(this.getArea());
	}
}
public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(14.5);
		System.out.println(c1.getArea());
		
		  Area c2 = new Circle(16);
//reference type(Area)   Object type(Circle)
		//c2.displayArea(); //throws Error, method undefined, a super element i.e., interface doesn't contains this method
		System.out.println(c2.getArea());
		
		//Java rule: You can instantiate an interface only if you provide an implementation at the same time.
		Area c3 = new Area() { //(anonymous) class created-> interface implemented-> Object created
			public double getArea() {
				int l=10, b=2;
				return (l*b);
			}
		};
		System.out.println(c3.getArea());
	}

}
