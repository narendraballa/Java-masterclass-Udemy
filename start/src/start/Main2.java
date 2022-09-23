package start;

public class Main2 {
	
	public static void main(String [] args) {
		
		printmegabytesandkilobytes(2500);
		printmegabytesandkilobytes(-1024);
		printmegabytesandkilobytes(5000);
		
		 float minvalue =Float.MIN_VALUE;
         float maxvalue =Float.MAX_VALUE;
         
        System.out.println("float minvalue = " + minvalue);
        
        
        System.out.println("float maxvalue = " + maxvalue);
        
        double kilometers = (100*1.609344);
        System.out.println("100 miles in km is equal to " + kilometers);
        
        

}

	public static void printmegabytesandkilobytes(int kilobytes) {
		
		if(kilobytes<0) {
			System.out.println("invalid value");
			
		}
		int megabytes=(kilobytes/1024);
		int kiloremainder = kilobytes%1024;
        System.out.println(kilobytes+" KB = "+megabytes+" MB and "+kiloremainder+" KB");
			
	}
	
	
}