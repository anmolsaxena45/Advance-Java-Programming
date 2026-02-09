package Encapsulate;
class Student1 {
	private int[] marks = new int[5];
	
	public void setMarks(int[] marks) {
		for (int i=0; i<marks.length; i++) {
			this.marks[i] = marks[i];
		}
	}
	
	public double getAvg() {
		int sum=0;
		for(int i=0; i<marks.length; i++) {
			sum += marks[i];
		}
		return (double)sum/marks.length;
	}
}
public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		s1.setMarks(new int[]{47, 72, 64, 67, 82});
		System.out.println(s1.getAvg());
	}

}
