package javaPractice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int numOne;
		int numTwo;
		int result;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("First Number : ");
		numOne = scan.nextInt();
		
		System.out.print("Second number : ");
		numTwo = scan.nextInt();
		
		result = numOne + numTwo;
		
		System.out.println();
		System.out.println(numOne + " + "  + numTwo + " = " + result);
		
		System.out.println();
		
		float num1;
		float num2;
		float result1;
		
		System.out.print("Enter 1st Number : ");
		num1 = scan.nextFloat();
		
		System.out.print("Enter 2nd Number : ");
		num2 = scan.nextFloat();
		
		result1 = num1 / num2;
		
		System.out.println();
		System.out.println(num1 + "/ " + num2  + " = " + result1);
		
		
		
		
		
		
	}

}
