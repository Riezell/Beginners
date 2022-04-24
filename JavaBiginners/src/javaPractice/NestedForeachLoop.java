package javaPractice;

public class NestedForeachLoop {

	public static void main(String[] args) {
		
		String users[][] = {
				{"David","david123"},
				{"Arlene","arlenere123"},
				{"Hezel","hezel123","Maria"},
				{"Jaymar","jaymar123","Aco","Balla123"}
				
		};
		
		for(String user[]: users) {
			
			for(String info:user) {
			System.out.println(info);
			}
			
			System.out.println();
		}
	}

}
