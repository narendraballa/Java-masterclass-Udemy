import java.util.Scanner;
public class challenge {

	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		int counter=0;
		int sum=0;
		
		while(true) {
			int order=counter+1;
			System.out.println("Enter number #" + order  +" :");
			
			boolean isanInt=sc.hasNextInt();
			if(isanInt) {
				int number=sc.nextInt();
				counter++;
				sum+=number;
				if(counter==10) {
					break;
				}
				
			}else {
				System.out.println("invalid number");
			}
			sc.hasNextLine();
			
		}
		System.out.println("sum is " + sum);
		sc.close();
	}
}
