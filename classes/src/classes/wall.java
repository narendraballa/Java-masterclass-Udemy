package classes;

public class wall {
	
	private double width;
	private double height;
	
	
	
	public wall() {
		
	}
	
	public wall(double width,double height) {
		this.width = width;
        this.height = height;
		if(width < 0){
	            this.width = 0;
	        }
	        
	        if(height < 0){
	            this.height = 0;
	        }
	        
	        
	}
	
	public double getwidth() {
		return width;
	}
	
	public double getheight() {
		return height;
	}
	
	
	public void setwidth(double width) {
		if(width<0) {
			this.width=0;
		}
		this.width=width;
	}

	public void setheight(double height) {
		if(height<0) {
			this.height=0;
		}
		this.height=height;
	}
	
	public  double getarea() {
		return (this.width*this.height);
	}
	
}
