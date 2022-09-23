package loops;

public class digitsumchallenge {
	
public static void main(String [] args) {
		
		System.out.println("sum of digits is = " + sumdigits(12));
		System.out.println("sum of digits is = " + sumdigits(229));
		System.out.println("sum of digits is = " + sumdigits(-229));
		System.out.println("sum of digits is = " + sumdigits(5));
	}
	
	public static int sumdigits(int number) {
		
		if(number<10) {
			System.out.println("invalid value");
		}
		int sumofdigits=0;
		                           //125--> 125/10 =12 ==> 12*10 =120 --> 125 -120=5
		while(number>0) {
			                      // extract least significant digit
			int digit=number%10;
			sumofdigits+=digit;
            number/=10;		  //drop least significant digit
		}
		
		return sumofdigits;
	}

}
