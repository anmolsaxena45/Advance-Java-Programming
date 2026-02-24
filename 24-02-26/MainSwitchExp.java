package SwitchExp;

public class MainSwitchExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 21;
		String res = switch(day) {
		case 1, 3, 4 -> {
			System.out.println("1, 3, 4");
			yield "Monday"; //return in switch
		}
		case 2 -> "Tuesday";
		default -> "None";
		};
		System.out.println(res);

	}

}
