package javaPractice;

public class SwitchStatement {

	public static void main(String[] args) {
		
		char grade ='A';
		
		
		switch(grade) {
		
		case 'A':
			System.out.println("Outstanding");
			break;
		case 'B':
			System.out.println("Excellent");
			break;
		case 'C' :
			System.out.println("Satisfactory");
			break;
		default:
			System.out.println("Invalid Grade");
			
		}
			System.out.println();
			
			String status = "admin";
			
			switch(status) {
			
			case "admin":
				System.out.println("Hi Admin");
			break;
			case "user":
				System.out.println("Hi User");
			break;
			default:
				System.out.println("Invalid Status");
			
		}
			System.out.println();
			
			int num = 2;
			
			switch (num) {
			
			case 1:
				System.out.println("Hi Admin");
			break;
			case 2:
				System.out.println("Hi user");
			break;
			default:
				System.out.println("Invalid");
			}
			
	
	}

}
