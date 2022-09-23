package day14;

public class areacalculator {

	public static void main(String [] args) {
		area(5,4);
		area(-1.0);
		area(5.0);
	}
	
	public static double area(double radius) {
		if(radius<0) {
			System.out.println("invalid value");
			return -1;
		}
		
		double area=22/7*radius*radius;
		System.out.println("area of circle is "+radius*radius*22/7);
		return area;
	}
	public static double area(double x,double y) {
		if((x<0) || (y<0)) {
			System.out.println("invalid value");
			return -1;
		}
		System.out.println("area of rectangle is  " + x* y);
		double areaofrectangle=x*y;
		return areaofrectangle;
	}
	
}
