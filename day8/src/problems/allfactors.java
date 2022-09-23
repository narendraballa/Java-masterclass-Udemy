package problems;

public class allfactors {
	
	public static void main(String [] args) {
		
		printfactors(6);
		printfactors(21);
	}
	public static int printfactors(int number) {
		
		if(number<1) {
			System.out.println("invalid value");
		}
		int factor=0;
		for(int i=1;number>=i;i++) {
			if(number%i==0) {
				factor=i;
				
				System.out.println("factors are" + 	factor);
                			
			}
			
		}
		return -1;
		
	}

}
