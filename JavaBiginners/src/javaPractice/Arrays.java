package javaPractice;

public class Arrays {

	public static void main(String[] args) {
		
	
		String studentNames[] = {"Marites","Marilou", "Maricon","Maria","Maria"};
		
		System.out.println(studentNames[2]);
		
		studentNames[0] = "Salanga";
		System.out.println(studentNames[0]);
		
		System.out.println();
		
		int numbers[] = {10,11,12,13,14,15};
		
		System.out.print(numbers[4]);
		

		System.out.println();
		
		String instructors[] = new String[10];
		int instructorNumS[] = new int[10];
		
		instructors[8] = "Love";
		instructors[5] = "Lovely";
		
		System.out.println(instructors[8]);
		System.out.println(instructors[5]);
		
	}

}
