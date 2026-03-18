//Create an interface PaymentMethod with method pay().
//Implement it in two classes.
//
//Pass the interface as a method parameter and:
//call pay()
//observe dynamic behavior
//explain why this design is better than if-else

interface PaymentMethod{
	void pay(double amount);
}

class Card implements PaymentMethod{
	public void pay(double amount) {
		System.out.println("Amount paid : $" + amount + " using card");
	}
}

class UPI implements PaymentMethod{
	public void pay(double amount) {
		System.out.println("Amount paid : $" + amount + " using UPI");
	}
}

//Passing interface as parameter in process method
class PaymentService{
	void process(PaymentMethod method, double amount) {
		method.pay(amount);
	}
}

public class PaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentService service = new PaymentService();
		
		PaymentMethod card = new Card();
        PaymentMethod UPI = new UPI();
        
        service.process(card, 100.0);
        service.process(UPI, 500.0);
	}

}
