package javaPractice;

import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] animals = {"Cat","Dog", "Bird","Chicken","Marti"};
		
		System.out.print("Animal To Search : ");
		String search = scan.nextLine();
		
	for(String x: animals) {
	//	System.out.println(x);
		
		if(x.equals(search)) {
			System.out.println("We Found " + x);
			break;
		}else {
			System.out.println(x);
		}
		
		
	}
		
	}
}
