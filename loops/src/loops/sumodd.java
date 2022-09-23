package loops;

public class sumodd {
	
	public static void main(String [] args) {
		
		Sumodd(1,100);
		Sumodd(-1,100);
		
		
		
	}
	
	public static boolean isodd(int number) {
		if(number<0) {
			return false;
		}
		if(number%2==0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static boolean Sumodd(int start, int end) {
		int odds=0;
		for(int i=start;i<=end;i++) {
			if(i % 2 !=0) {
				odds+=i;
			}
			
				
		}
		System.out.println("I =" + odds);
		return true;
		}
	
	}
	


