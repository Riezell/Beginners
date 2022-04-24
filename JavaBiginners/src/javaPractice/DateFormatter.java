package javaPractice;

import java.util.Scanner;

public class DateFormatter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Month : ");
		int month = scan.nextInt();
		
		System.out.print("Date  : ");
		int date = scan.nextInt();
		
		System.out.print("Year  : ");
		int year = scan.nextInt();
		
		String monthWord = "";
		
		switch(month) {
		case 1:
			monthWord = "January";
		break;
		case 2:
			monthWord = "Febraury";
		break;
		case 3:
			monthWord = "March";
		break;
		case 4:
			monthWord = "April";
		break;
		case 5:
			monthWord = "May";
		break;
		case 6:
			monthWord = "June";
		break;
		case 7:
			monthWord = "July";
			break;
		case 8:
			monthWord = "August";
			break;
		case 9:
			monthWord = "September";
			break;
		case 10:
			monthWord = "Octorber";
			break;
		case 11:
			monthWord = "November";
			break;
		case 12:
			monthWord = "December";
		break;
		default:
			
		}
		
		System.out.println();
		
		if(monthWord == "") {
			System.out.println("Invalid Month");
		}else { 
			if(date >31 || date <=0) System.out.println("Invalid Date");
		    else System.out.println(monthWord + " "+ date + ", " + year);
		}
			
			
				

	}

}
