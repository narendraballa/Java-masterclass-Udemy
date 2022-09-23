package start;

public class equalsum {
	
	public static void main(String [] args) {
		hasequalsum(1,1,1);
		hasequalsum(1,1,2);
		hasequalsum(1,-1,0);	
		hasteen(9,99,19);
		hasteen(22,23,34);
	}
	public static boolean hasteen(int num1,int num2,int num3) {
		if((num1>=13 &&num1<=19)||(num2>=13 &&num2<=19)||(num3>=13 &&num3<=19)) {
			System.out.println("true");
			return true;
			
		}else {
			System.out.println("false");
			return false;
		}
	}
	
	public static boolean hasequalsum(int a,int b,int c) {
		
		if((a+b==c)) {
			System.out.println("true");
			return true;
		}
		else
			
		{
			System.out.println("falsee");
			return false;
		}
		
	}

}
