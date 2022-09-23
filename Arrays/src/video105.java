import java.util.*;
import java.util.Scanner;

public class video105 {

	private static Scanner scanner=new Scanner(System.in);
	private static int[] basedata=new int[10];
	
	public static void main(String []args) {
		
		System.out.println("Enter your numbers");
		getInput();
		printarray(basedata);
		resizeArray();
		System.out.println("Enter 12 numbers");
		getInput();
		printarray(basedata);
	}
	private static void getInput() {
		for(int i=0;i<basedata.length;i++) {
			basedata[i]=scanner.nextInt();
		}
	}
	
	private static void printarray(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] +"");
		}
		System.out.println();
	}
	
	private static void resizeArray() {
		int[] original=new int[12];
		for(int i=0;i<original.length;i++) {
			basedata[i]=original[i];
		}
	}
	
}
