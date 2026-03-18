//Local Variable Type Inference(type of data to be stated upon declaring)
package Java10;

public class MainVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		var b=20;
		var name = "KIET";
		var val = 10.93;
		var c = 1.90;
		//var anm; //Cannot use 'var' on variable without initializer
		
		String Name = new String ("Anmol Saxena");
		var Name_var = new String ("Anmol");
		
		int[] arr = new int[] {1,2 };
		for (var ar : arr) System.out.println(ar);
		System.out.println("Hello World\rHi");
		
		
		        String message = """
		                Hello World
		                This is a multi-line string in Java.
		                It preserves formatting and line breaks.
		                """;
		        System.out.println(message);

	}

}
