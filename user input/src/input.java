import java.util.Scanner;
public class input {
	
	public static void main(String [] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter year of birth");
		boolean hasNextInt=sc.hasNextInt();   // used to check if string is used in case of int and viceversa i.e," sai in the place of yearofbirth."
		
		if(hasNextInt) {
			
			int yearofbirth=sc.nextInt();
			sc.nextLine();
			System.out.println("enter your name");
			String name=sc.nextLine();
			int age=2022-yearofbirth;
			
			if(age>=0 && age<100) {
				
				System.out.println("Your name is " + name +  " and you are " + age + "years old" );
			} else {
				System.out.println("Invalid year");
			}
			
			
		} else {
			System.out.println("Unable to parse year of birth");
		}
		
		
		sc.close();
	
	}
	

}
