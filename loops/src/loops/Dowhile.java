package loops;

public class Dowhile {
	
	
	
	public static void main(String [] args) {
	       
		
		isevennumber(6);
		
		
          int count=6;
          while(count!=6) {
        	  System.out.println("count value is " +count);
        	  count++;
          }
          
          for(int i=6;i<6;i++) {
        	  System.out.println("count value  " +i);
        	  
          }
          
          
          count=1;
          do {
        	  System.out.println("count is  " +count);
        	  count++;
          }while(count!=6);
          
	}
          
          
          
          public static boolean isevennumber(int number) {
        	  if(number%2==0) {
        		  System.out.println("even");
        		  return true;
        	  }else
        	  {
        		  System.out.println("false");
        		  return false;
        	  }
          }
          
          
	}


