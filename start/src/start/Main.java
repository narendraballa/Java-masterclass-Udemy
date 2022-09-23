package start;

public class Main {

	public static void main(String [] args) {
		System.out.println("Hello world");
		areequalbythreedecimalplaces(-3.1756,-3.175);
		areequalbythreedecimalplaces(-3.175,3.176);
	}

	public static boolean areequalbythreedecimalplaces(double number1,double number2) {
		
		int a=(int)number1*1000;
		int b=(int)number2*1000;
		
		if(a==b) {
				System.out.println("true");
				return true;
		}
		else {
			
			System.out.println("False");
			return false;
		}
	}
	
}
