package day14;

public class minutesandyears {
	 
	public static void main(String [] args) {
		printyearsanddays(525600);
		printyearsanddays(561600);
		printyearsanddays(1051200);
	}
  public static void printyearsanddays(long minutes) {
	  if(minutes<0) {
		  System.out.println("invalid value");
		  }
	  long years=minutes/525600;
	  long remainingminutes=(minutes-(years*525600));
	  long remainingdays=remainingminutes/1440;
	  
	  System.out.println(minutes+ "min=" + years+ "y" +remainingdays +"d");
  }
	
}
