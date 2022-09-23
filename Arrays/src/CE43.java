import java.util.*;
public class CE43 {

	public static void main(String[] args) {
        
		int[] array= {1,2,3,4,5};
		System.out.println("Array=" + Arrays.toString(array)) ;
	    reverse(array);
	    System.out.println("ReverseArray=" + Arrays.toString(array)) ;
	}

	private static void reverse(int[] array) {
		int temp;
		int maxIndex=array.length-1;
		int halflength=array.length/2;
		for(int i=0;i<halflength;i++) {
			 temp=array[i];
			array[i]=array[maxIndex-i];
			array[maxIndex-i]=temp;
		}
	}
	
}
