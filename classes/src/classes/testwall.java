package classes;

public class testwall {
	
	public static void main(String []args) {

	wall total=new wall(5,4);
	System.out.println("area is =" +total.getarea());
	
	total.setheight(-1.5);
	System.out.println("width= " + total.getwidth());
	System.out.println("height= " + total.getheight());
	System.out.println("area= " + total.getarea());
	
	}
	
}
