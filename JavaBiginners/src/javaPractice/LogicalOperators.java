package javaPractice;

import java.util.Scanner;

 class LogicalOperators {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean hasRuler = true;
		boolean hasBallpen =  true;
		
		if(hasRuler && hasBallpen)System.out.println("You Can Come In.");
		else System.out.println("You Can Come Home.");
		
		System.out.println();
		
		boolean hasPaper = false;
		boolean hasNotebook =  false;
		
		if(hasPaper || hasNotebook)System.out.println("You Can Come In.");
		else System.out.println("You Can Come Home.");
		
		System.out.println();
		
		boolean hasEraser = true;
		if(!hasEraser)System.out.println("You Can Come In.");
		else System.out.println("You Can Come HOme.");
				
		System.out.println();
		
		int age = 18;
		boolean isVerified = false;
		
		if(age >= 18 && isVerified)
		System.out.println("You Have Acess and Is Qualified");
		else if (age >= 18 && !isVerified)
		System.out.println("You Have Acess but not Qualified");
		else
		System.out.println("Acess Denied!");
			
			
			
		
	}

}
