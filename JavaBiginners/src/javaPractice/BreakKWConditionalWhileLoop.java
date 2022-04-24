package javaPractice;

public class BreakKWConditionalWhileLoop {

	public static void main(String[] args) {
		
        int i = 0;
		
        while(i < 5) {  
			System.out.println(i);
			i++;
			break;
        } 
        
        System.out.println("Finish");
        
        System.out.println();
        
        //CODITIONS IN WHIlE LOOP
        
        String[] names = {"David", "Arlene", "Jasfer", "Ace", "Patrick"};
        
        int y = 0;
         while(y < names.length) {
        	 
        	 if(names[y].equals("Ace")){
        		 System.out.println("We Found" + " " + names[y]);
        		 break;	 
        	 }else {
        		 System.out.println(names[y]);
        		 
        	 }
        	 
        	 y++;
         }
        
        
			
	}

}
