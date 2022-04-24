package javaPractice;

import java.util.Scanner;

public class ElseStatement {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter age : ");
		int age = scan.nextInt();
		
		if(age >= 18) {
			System.out.println("You Have Access");
		}else {
			System.out.println("Access Denied");
			
		}
		
	}

}
