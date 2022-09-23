package video93;

public class Encapsulation93 {

	private String name;
	private int health=100;
	private String weapon;
	
	public Encapsulation93(String name, int health, String weapon) {
		
		
		this.name = name;
		if(health>0 && health<=100) {
			this.health = health;	
		}	
		this.weapon = weapon;
	}
	
	public void losehealth(int damage) {
		this.health-=damage;
		if(this.health<=0) {
			System.out.println("player knocked down");
		}
	}

	public int getHealth() {
		return health;
	}
	
	
	
}
