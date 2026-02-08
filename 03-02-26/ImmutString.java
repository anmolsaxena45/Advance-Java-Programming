package Striing;

class demo {
	static void modify(String name){
		name = "Saxena";
		System.out.println(name);
	}
}
public class ImmutString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Anmol";
		System.out.println(name);
		
		demo.modify(name);
		System.out.println(name);
		
		//Concatenates numbers from 1 to 5

		//using String
		String s = "abc";
		s = s + 1 + 2 + 3 + 4 + 5;
		System.out.println(s);

		//using StringBuilder
		StringBuilder sb = new StringBuilder("abc").append(1).append(2).append(3).append(4).append(5);
		System.out.println(sb);
	}

}
