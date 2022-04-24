package javaPractice;

public class MethodsWithReturn {

	public static void main(String[] args) {
		
	int sum =add(5,2);
	System.out.println(sum); // change the sum into subtract,multiply, divide
	
	System.out.println(isLegalAge(19));
	

	}
	static int add(int num1, int num2) {
		
		return num1+num2;
	}
	static int subtract(int num1, int num2) {
		
		return num1-num2;                               // this is okay for calculator
	}
	static int multiply(int num1, int num2) {
		
		return num1*num2;
	}
	static int divide(int num1, int num2) {
		
		return num1/num2;
	}
	static boolean isLegalAge(int age) {    //boolean
		
		if(age >= 18)return true;
		else return false;
	}

}
