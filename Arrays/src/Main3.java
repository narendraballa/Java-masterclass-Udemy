import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {

		
		int n;  
		Scanner scanner=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");    
		n=scanner.nextInt();  
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		array[i]=scanner.nextInt();  
		}  
	
		System.out.println("Array element are :");  
		for (int i=0; i<n; i++)   
		{  
		System.out.println(array[i]);   
		
	}	

}

}