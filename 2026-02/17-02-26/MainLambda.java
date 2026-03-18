package FuncInterface;

interface Operation {
    int apply(int a, int b);
    static void execute(Operation op, int a, int b) {
        System.out.println(op.apply(a, b));
    }

}

public class MainLamda {
	public static void main(String args[]) {
		Operation op1 = (a,b) -> a+b;
		Operation op2 = (a,b) -> a-b;
		Operation op3 = (a,b) -> a*b;
		
		System.out.println(op1.apply(5, 4));
		
		Operation.execute(op2, 5, 4);
		Operation.execute(op3, 5, 4);
	}
}
