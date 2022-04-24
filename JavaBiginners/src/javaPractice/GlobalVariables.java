package javaPractice;

public class GlobalVariables {
	
	//Global Variables (put static in the beginning in order to read your code)
	static String section = "A";
	static int num =100;
	

	public static void main(String[] args) {
		
		saySection();
		sayNumber();
		
	}
	
	static void saySection() {
		System.out.println(section);
		
	}
	
	static void sayNumber() {
		System.out.println(num);
	}

}
