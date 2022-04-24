package javaPractice;

import java.util.Scanner;

public class NestedConditionalStatement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Age:  ");
		int age = scan.nextInt();
		boolean isVerified = true;
		
		if(age >=18) {
			System.out.println("You Have Acess");
	
		if(isVerified) {
				System.out.println("Qualified");	
		}else {
			System.out.println("Not Qualified");
		}
		}else {
			System.out.println("Acess Denied");
		}
		

	}

}
