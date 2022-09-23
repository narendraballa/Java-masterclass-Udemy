package problems;

public class lastdigitchecker {
	
	public static void main(String []args) {
		
		System.out.println(hassamelastdigit(41,22,71));
		System.out.println(hassamelastdigit(23,32,42));
		System.out.println(hassamelastdigit(8,96,999));
		System.out.println(isvalid(10));
		System.out.println(isvalid(468));
		System.out.println(isvalid(1051));
		
	}
	
	public static boolean hassamelastdigit(int a,int b,int c) {
		
		if(a >= 10 && a <= 1000 && b >= 10 && b <= 1000 && c>=10 && c<=1000) {
	     
	}
		int lastA=a%10;
		int lastB=b%10;
		int lastC=c%10;
		if(lastA==lastB ||lastB==lastC||lastA==lastC) {
			System.out.println("same last digit");
			return true;
		}
		System.out.println("not in range");
		return false;

}
	public static boolean isvalid(int num) {
		if(num>=10 && num<=1000) {
			return true;
		}else {
		return false;
		}
	}
	
}
