package javaPractice;

public class OverloadingMethods {

	public static void main(String[] args) {
		
		System.out.println(add(5,2));
		System.out.println(add(18,38,45));
		System.out.println(add(3.56,2.34));
	}
	static double add( double num1,double num2) {
		return num1 + num2;	
	}
	static int add(int num1, int num2) {
		return num1 + num2;	
	}
	
	static int add(int num1,int num2,int num3) {
		return num1 + num2 + num3;
	}
	
}
		
	


