
class Car{
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;
	
	public Car(int cylinders, String name) {
		super();
		this.cylinders = cylinders;
		this.name = name;
		this.wheels=4;
		this.engine=true;
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}

		public String startEngine() {
			return "Car--> startEngine";
		}
	
		public String acclerate() {
			return "Car--> Acclerate";
		}
		
		public String brake() {
			return "Car-->brake"; 
		}
		
}

class Mitsubshi extends Car{

	public Mitsubshi(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "Mitsubshi--> startEngine()";
	}

	@Override
	public String acclerate() {
		return "Mitsubshi--> acclerate()";
	}

	@Override
	public String brake() { 
		return "Mitsubshi--> brake()";
	}
	
               		
	
}


public class video96 {
 
	public static void main(String [] args) {
		
		Car car=new Car(8,"Base car");
		System.out.println(car.startEngine());
		System.out.println(car.acclerate());
		System.out.println(car.brake());
		
		Mitsubshi mitsubshi=new Mitsubshi(6,"Outlander VRW 4WD");
		System.out.println(mitsubshi.startEngine());
		System.out.println(mitsubshi.acclerate());
		System.out.println(mitsubshi.brake());
		
		Ford ford=new Ford(6,"Ford falcon");
		System.out.println(ford.startEngine());
		System.out.println(ford.acclerate());
		System.out.println(ford.brake());
	}						
}
