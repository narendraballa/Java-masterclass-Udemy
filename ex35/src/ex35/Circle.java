package ex35;

public class Circle {
    
	private double radius;
	
	
	public Circle(double radius) {
		if(radius<0) {
			radius=0;
		} else {
			
		this.radius=radius;
		
		}
	}

	public double getradius() {
		return radius;
	}
	
	public double getArea() {
		return (radius*radius*22/7);
	}
	
	
	
}
