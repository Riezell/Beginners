package javaPractice;

public class ForLoop {

	public static void main(String[] args) {
		
		// for loop
	//	for(int i = 0;i < 5;i++) {
		//	System.out.println(i);
			
	//	}
		
		String[] names  = {"David","Alenere", "Ace","Jaymar","Patrick"};

		for(int i = 0;i < names.length;i++) {
			if(names[i].equals("Ace")) {
			System.out.println("We Found " + names[i]);
			break;
			}else {
				System.out.println(i);
				
			}
		}
			
		
	}

}
