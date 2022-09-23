package problems;

public class palindrome {
	
	public static void main(String []args) {
		ispalindrome(121);
		ispalindrome(178);
		
	}
	
	public static boolean ispalindrome(int number) {
		int reverse=0;
		int lastdigit=0;
		
		Integer num = Integer.valueOf(number);
		while(number!=0) {
			lastdigit=number%10;
			reverse=reverse*10+lastdigit;
			number/=10;
		}
		
		
	if(reverse==num) {
		System.out.println("palindrome");
		return true;
	}
	else {
		System.out.println("not palindrome");
		return false;
	}
		
	}

}
