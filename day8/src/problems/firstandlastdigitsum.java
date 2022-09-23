package problems;

public class firstandlastdigitsum {
	
	public static void main(String [] args) {
		
		sumfirstandlastdigit(252);
		sumfirstandlastdigit(257);
		sumfirstandlastdigit(0);
		sumfirstandlastdigit(5);
		sumfirstandlastdigit(-10);
		
		
		
	}
	public static int sumfirstandlastdigit(int number) {
		
		
		int lastdigit=0;
		if(number>=0) {
			lastdigit=number%10;
			while(number>9) {    // if number is greater than 9 then finding first digit is this
				number/=10;
			}
			System.out.println("first and last digit sum is = " +(number + lastdigit));
			return 0;
		}else
			System.out.println("invalid value");
	          return-1; 
	}
	

}
