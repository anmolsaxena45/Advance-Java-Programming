class CountStudent{
	static int student =0;
	int marks = 71;
	CountStudent(){
		student++;
	}
	
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountStudent s1 = new CountStudent();
		CountStudent s2 = s1;
		CountStudent s3 = s1;
		
		System.out.println(s1.marks);
		System.out.println(s2.marks);
		s3.marks = 82;
		
		System.out.println(s3.marks);
		System.out.println(s2.marks);
		
		System.out.println(s1.student);
	}

}
