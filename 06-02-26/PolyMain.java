package Poly;
// The ability of an object to have multiple form/ behaviour in different situation.

//Types of Polymorphism
  //1. Method Overloading - Compile Time Overloading
  //No. of parameters
  //type of parameters

  //2. Method Overriding - RunTime Overloading


class Animal{
	String name;
	String sound;
	
	Animal(){
		this("Cat","");
	}
	Animal (String name, String sound){
		this.name = name;
		this.sound = sound;
	}
	
		void getInfo() {
		System.out.println("Name : " + name);
		System.out.println("Sound : " + sound);
		System.out.println();
	}
	
	void getInfo(String name, String sound, int legs) {
		System.out.println("Name : " + name);
		System.out.println("Sound : " + sound);
		System.out.println("Legs : " + legs);
		System.out.println();
	}
}

class Cat extends Animal{
	Cat(String name, String sound){
		//Initializes constructor 2 times
//		this.name = name;
//		this.sound = sound;
		
		//Sol: Call super-class constructor
		super(name, sound);
		
//		void getInfo(//1. parameter, 2. parameter){
//				
//	}
}
public class PolyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal("Billoo", "meoooooowwwwww");
		a1.getInfo();
		a1.getInfo("Horse", "hinnnn", 4);
		
		Cat c1 = new Cat("Cat2", "Meoowww");
		c1.getInfo();
		//sub-class constructor calling super-class constructor implicitly.
	}

}
