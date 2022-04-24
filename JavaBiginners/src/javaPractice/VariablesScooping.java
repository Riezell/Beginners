package javaPractice;

public class VariablesScooping {

	public static void main(String[] args) {
		
	

		greet();

	}
	
	static void greet() {
		
		//local variables = only accessible inside of a block of code
		String greetings = "What's Up";
		System.out.println(greetings);
	}

}
