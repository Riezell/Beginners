package javaPractice;

import java.util.Scanner;

public class AuthenticationSimulation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[]usernames = {"David", "Jaymar", "Ace"};
		String[] passwords = {"Utouto","Dodong", "Inday"};
		
		System.out.print("Username : ");
		String username = scan.nextLine();
		
		System.out.print("Password : ");
		String password = scan.nextLine();
		
		for(int i = 0;i < usernames.length;i++) {
			
			if(username.equals(usernames[i]) && password.equals(passwords[i])){
				System.out.println("Welcome, " + usernames[i]);
				break;
					
			}
		}
		
		

	}

}
