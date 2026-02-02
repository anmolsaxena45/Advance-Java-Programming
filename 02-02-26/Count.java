//Create a Java class Counter with:
//an instance variable count
//a constructor that increments count
//a method that displays the value of count
//Create multiple objects and analyze whether count behaves as expected.

class Counter{
	int count=0;
	Counter(){
		count++;
	}
	
	void getCount() {
		System.out.println(count);
	}
}
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter();
		c1.getCount();
		
		Counter c2 = new Counter();
		c2.getCount();
		
		Counter c3 = new Counter();
		c3.getCount();
	}

}

//The constructor did run every time,
//but it incremented a fresh variable, not a shared one.
//Instance var - separate copy
//static var - shared copy
