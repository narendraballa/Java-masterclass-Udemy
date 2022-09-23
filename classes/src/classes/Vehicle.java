package classes;

public class Vehicle {
 
	private String name;
	private String size;
	
	private int currentvelocity;
	private int currentdirection;
	
	public Vehicle(String name,String size){
	
		this.name=name;
		this.size=size;
	
		this.currentvelocity=0;
		this.currentdirection=0;
	}

    public void steer(int direction) {
    	this.currentdirection+=direction;
    	System.out.println("Vehicle.steer(): Steering at" +currentdirection +"degrees.");
    }
	
    public void move(int velocity,int direction) {
    	currentvelocity=velocity;
        currentdirection=direction;
    	System.out.println("Vehicle.move(): Moving at" +currentvelocity +"in direction" + currentdirection);
        
    }
	
    public String getname() {
    	return name; 
    }
    
    public String getsize() {
    	return size;
    }
    
    public int getcurrentvelocity() {
    	return currentvelocity;
    }
    
    public int getcurrentdirection() {
    	return currentdirection;
    }
    
    public void stop() {
    	this.currentvelocity=0;
    }
    
    
    
}

