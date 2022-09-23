import java.util.Scanner;

public class minmax {

	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int min=0;
		int max=0;
		while(true) {
			System.out.println("Enter number");
	        boolean isanInt=sc.hasNextInt();
			
	        if(isanInt) {
	               int number=sc.nextInt();
	               if(number>max) {
	            	   max=number;
	            	   }
	                
	               if(number<min) {
	            	   	min=number;
	               }
	               
	               
	        }else {
	        	break;
	        }
		
	        sc.nextLine();                      //handle input
		
		}
		
		System.out.println(" minimum number is " +min);
		System.out.println(" maximum number is " +max);
		
		sc.close();
		
	}
}
