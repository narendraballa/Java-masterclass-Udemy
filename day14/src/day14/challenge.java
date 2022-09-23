package day14;

public class challenge {
	
	public static void main(String [] args) {
	System.out.println(getdurationstring(65,45));
	System.out.println(getdurationstring(3945));
	}
 
	private static String getdurationstring(long minutes,long seconds) {
	  if((minutes<0)||(seconds<0)&&(seconds>59)) {
		  return "invalid value";
		  
	  }
	   long hours=minutes/60;
	   long remainingminutes= minutes%60;
	   return hours +"h" + remainingminutes +"m" +seconds +"s"; 
	   
	   
  }
	private static String getdurationstring(long seconds) {
		if(seconds<0) {
			return "invalid value";
		}
		long minutes=seconds/60;
		long remainingseconds=seconds%60; 
		return getdurationstring(minutes,remainingseconds);
		
	}
}
