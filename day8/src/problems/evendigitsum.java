package problems;

public class evendigitsum {
	
	public static void main(String [] args) {
		
		System.out.println(getevendigitsum(252));
		System.out.println(getevendigitsum(123456789));
		System.out.println(getevendigitsum(-22));
		
	}
	
	public static int getevendigitsum(int number) {
		if(number<0) {
			return -1;
		}
		int lastdigit=0;
		int evendigitsum=0;
		while(number!=0) {
			lastdigit=number%10;
			if(lastdigit%2==0) {
				evendigitsum+=lastdigit;
			}
			number/=10;
		}
		return evendigitsum;
	}

}
