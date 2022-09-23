package day8;

public class barkingdog {
	
	public static void main(String [] args) {
		
		shouldwakeup(true,1); 
		
	}

	
	  public static boolean shouldwakeup(boolean barking,int hourofday) {
		
			if (hourofday<0 || hourofday>23) {
				return false;
			}
		if (barking==true && hourofday<8 || hourofday>22) {
			return true;
		}
		else {
			return false;
		}
		  
	  }
}
