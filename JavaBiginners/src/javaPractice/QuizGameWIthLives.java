package javaPractice;

import java.util.Scanner;

public class QuizGameWIthLives {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int lives = 3;
		String answer;
		while(lives > 0) {
			System.out.println("What is at the Center of our Solar System");
			System.out.print("Answer : ");
			answer = scan.nextLine();
			
			
			if(answer.equals("Sun"))break;
			else lives--;
			System.out.println();
			
			
		}
	if (lives > 0)System.out.println("You Won");
	else System.out.println("You Lost");

		
	}

}
