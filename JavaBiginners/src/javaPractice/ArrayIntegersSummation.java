package javaPractice;

import java.util.Scanner;

public class ArrayIntegersSummation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = {67,35,78,45,35,89,90};
		int sum = 0;
		
		for(int num:numbers){
			sum = sum + num;
			System.out.println();
			
		}
		System.out.println("Sum : " + sum);
	}
	

}
