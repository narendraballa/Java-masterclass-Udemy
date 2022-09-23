import java.util.Scanner;
public class inputcalc {

	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int average=0;
		int count=0;
		
		while(true) {
			System.out.println("Enter number");
			boolean isInt=sc.hasNextInt();
			
			
			if(isInt) {
				int value=sc.nextInt();
				sum+=value;
				count++;
				
			}
			 
			else if(count==0) {
				System.out.println("sum=0 average=0");
				break;
			}else {
				average=sum/count;
				System.out.println("Sum is "+sum + "Average is " +average);
				break;
			}
			sc.nextLine();
			}
	       		
		
		sc.close();
    }

}