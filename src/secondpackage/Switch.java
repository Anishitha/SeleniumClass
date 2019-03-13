package secondpackage;

public class Switch {

	public static void main(String[] args) {
		
		String str = "India";
		
		switch (str)
		{
		case "China":
			System.out.println("It is China");
			
			case "India":
				System.out.println("It is India");
			break;

		default:
			System.out.println("No Input");
			break;
		}

	}

}
