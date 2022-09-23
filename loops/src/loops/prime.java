package loops;

public class prime {
	
	public static void main(String [] args) {
		
		int count=0;
		for(int i=10;i<50;i++) {
			if(isprime(i)) {
				count++;
				System.out.println("number " + i +" is prime number");
				if(count==10) {
					System.out.println("exiting loop");
					break;
				}
			}
			
		}
	}
	
	public static boolean isprime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
		   
			return false;
			
			}
		
		}
		
		return true;
		
	} 	 
}