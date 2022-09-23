package classes;

public class vipcustomer {
  
	private String name;
	private double creditlimit;
	private String email;
	
	public vipcustomer() {
		this("default name",50000.00,"default@email.com");
	}
	
	
	public vipcustomer(String name,double creditlimit) {
		this(name,creditlimit,"unknown@email.com");
	
	}
	
	public vipcustomer(String name,double creditlimit,String email) {
		this.name=name;
		this.creditlimit=creditlimit;
		this.email=email;
	}
	
	
	
	public String getname() {
		return name;
	}
	
	public double getcreditlimit() {
		return creditlimit;
	}
	
	public String getemail() {
		return email;
	}
	
	
}
