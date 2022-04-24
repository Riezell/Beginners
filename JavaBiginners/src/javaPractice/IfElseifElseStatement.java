package javaPractice;

import java.util.Scanner;

public class IfElseifElseStatement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Age : ");
		int age = scan.nextInt();
		
		if(age >=18) {
		System.out.println("You have Access");
		}else if(age >=13){
			System.out.println("You Need Parent Consent!");
		}else {
			System.out.println("Acess Denied!");	
		}
		

	}

}
