package sec7co91;

public class Car extends Vehicle {

	private int doors;
	private int enginecapacity;
	public Car(String name, int doors, int enginecapacity) {
		super(name);
		this.doors = doors;
		this.enginecapacity = enginecapacity;
	}
	 
}
