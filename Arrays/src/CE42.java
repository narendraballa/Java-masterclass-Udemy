import java.util.Scanner;
public class CE42 {
	
	private static Scanner scanner=new Scanner(System.in); 

	public static void main(String []args) {
		System.out.println("Enter n:");
 		int n=scanner.nextInt();
 		scanner.nextLine();		
	}
	 
		public static int[] readElements(int n) {
		int []array=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter number");	
			int a=scanner.nextInt();
			scanner.nextLine();
			array[i]=a;
		}
		return array;
	}
		
	public static int readInteger() {
		scanner.nextLine();
		int len=scanner.nextInt();
	    return len;
	}
		
	public static int findMin(int[] array ) {
		int min=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		return min;
	}
	
}
