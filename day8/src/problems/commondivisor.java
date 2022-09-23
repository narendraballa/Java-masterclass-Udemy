package problems;

public class commondivisor {
	
	public static void main(String [] args) {
		getgreatestcommondivisor(25,15);
		getgreatestcommondivisor(12,30);
		getgreatestcommondivisor(9,18);
		getgreatestcommondivisor(81,153);
		
	}
	
	public static int getgreatestcommondivisor(int first,int second) {
		
		if(first<10 || second<10) {
			System.out.println("invalid value");
			return-1;
		}
		int greatest=0;
		for(int i=1;((i<=first)&&(i<=second));i++) {
			if((first%i==0)&&(second%i==0)) {
				greatest=i;
			}
		}
		System.out.println("greatest common divisor is " + greatest);
		return 1;
		
	}
	

}
