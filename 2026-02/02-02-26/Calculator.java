class Sum{
	void sum(int a, int b) {
		System.out.println(a+b);
	}
}

class Prod{
	int c;
	Prod(int a, int b){
		System.out.println(a*b);
	}
}


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s = new Sum();
		s.sum(5, 6);
		
		
		Prod p = new Prod(5, 6);
	}

}
