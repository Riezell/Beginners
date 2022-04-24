package javaPractice;

import java.util.Scanner;

public class EqualFunction {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Greetings :");
		String greet = scan.nextLine();
		
		//if(greet.equalsIgnorecase("Hello"){
		if(greet.equals("Hello")){
			System.out.println("Hi");
		}
		
	}

}
