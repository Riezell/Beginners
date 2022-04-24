package javaPractice;

public class MethodsWithArguments {

	public static void main(String[] args) {
		
		greet("Steve",35);
		
		String x = "Steve";
		String y = "To All My Exes";
		
		print("I Love You " + x);
		
		print("I Hate You " + y);
		
		add(5,11);
		
	
	}
	static void greet(String name, int age) {
		System.out.println("Hello, " + name);
		System.out.println("You Are " + age + " Years Old.");
	}
	static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	static void print(String word) {
		System.out.println(word);
	}

}
