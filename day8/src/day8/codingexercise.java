package day8;

public class codingexercise {
	
	public static void main(String [] args) {
		
		isLeapYear(2000);
		
	}
	
	public static boolean isLeapYear(int Year) {
	    if (Year == 1 || Year <= 9999) {
	        if ((Year % 4 == 0) && (Year % 100 != 0) || (Year % 400 == 0)) {
	            System.out.println("true its a leap year");
	            return true;
	        } else
	            System.out.println("false not leap year");
	        return false;

	    } else {
	        System.out.println("invalid value");
	        return false;
	    }
	}

}
