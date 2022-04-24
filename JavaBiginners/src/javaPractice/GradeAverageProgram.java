package javaPractice;

import java.util.Scanner;

public class GradeAverageProgram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Math     : ");
		float mathGrade = scan.nextFloat();
		
		System.out.print("Science  : ");
		float scienceGrade = scan.nextFloat();
		
		System.out.print("English  : ");
		float englishGrade =scan.nextFloat();
		
        System.out.print("Filipino : ");
		float filipinoGrade = scan.nextFloat();
		
	    
		float average = (mathGrade + scienceGrade + englishGrade + filipinoGrade) / 4;
		
		System.out.println();
		System.out.println("Average  : "  +  average);
		
		if(average > 100) System.out.println("Invalid Garde");
		else if(average >= 98) System.out.println("With Highest Honors");
		else if(average >= 95) System.out.println("With High Honors");
		else if(average >= 90) System.out.println("With honors");
		else if(average >= 75) System.out.println("Passed");
		else System.out.println("Failed");
		

	}

}
