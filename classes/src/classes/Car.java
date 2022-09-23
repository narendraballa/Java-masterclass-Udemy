package classes;

public class Car extends Vehicle {
    
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	
	private int currentgear;
	
	public Car(String name,String size,int wheels,int doors,int gears,boolean isManual) {
		super(name,size);
		this.wheels=wheels;
		this.doors=doors;
		this.gears=gears;
		this.isManual=isManual;
		this.currentgear=1;
	}
	
	public void changegear(int currentgear) {
		this.currentgear=currentgear;
        System.out.println("Car.setcurrentgear(): changed to " +this.currentgear  +  "gear");   	
 	}
	
	public void changevelocity(int speed,int direction) {
		
		 System.out.println("Car.changevelocity(): Velocity	" + speed + "direction"  + direction);
		 move(speed,direction);
	}
	
	
}
