package ex35;

public class circlemain {
	
	public static void main(String [] args) {
	     
		Circle circle=new Circle(3.75);
		System.out.println("circle.radius= " + circle.getradius());
		System.out.println("circle.area= " + circle.getArea());
		Cylinder cylinder = new Cylinder(5.55, 7.25);
		System.out.println("cylinder.radius= " + cylinder.getradius());
		System.out.println("cylinder.height= " + cylinder.getheight());
		System.out.println("cylinder.area= " + cylinder.getArea());
		System.out.println("cylinder.volume= " + cylinder.getVolume());
		

	}
}
