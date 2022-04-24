package javaPractice;

public class IteratingTwoDArrays {

	public static void main(String[] args) {
		
		String users[][] = {
				{"David","david123"},
				{"Arlene","arlenere123"},
				{"Hezel","hezel123","Maria"},
				{"Jaymar","jaymar123","Aco","Balla123"}
				
		};
		for (int row = 0;row < users.length;row++) {
		
	//	System.out.println(users[row].length);
		for(int col =0; col< users[row].length;col++) {
			System.out.println(users[row][col]);
		}
		System.out.println();
	}
	}

}
