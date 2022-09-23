package problems;

public class shareddigit {
	
	public static void main(String []args) {
		 
		hasSharedDigit(12,23);
		hasSharedDigit(9,99);
		hasSharedDigit(15,55);
		
		
	}
	public static boolean hasSharedDigit (int a, int b) {
        if((a > 9) && (a <= 99) || (b > 9) && (b <= 99)) {
        	
        	
        }
            while(a != 0){
                int check = a % 10;
                a /= 10;

                while(b != 0 ){
                    if(b % 10 == check){
                        System.out.println("true");
                        return true;
                    }

                    b /= 10;
                }
            }
        
        System.out.println("false");
        return false;
    }
	
	
	
	
	
	
	
	
	
	//public static boolean hasshareddigit(int num1,int num2){
		//if(num1 > 9 || num1 <= 99 || num2 > 9 || num2 <= 99) {
//
	//	}
		//while(num1!=0) {
			//int check= num1%10;
			//num1/=10;
			
			//while(num2!=0) {
				//if(num2%10==check) {
					//System.out.println("true");
				//}
				//num2/=10;
			//}
	
	//	}
      //  return false;
		
	//}
	
}
