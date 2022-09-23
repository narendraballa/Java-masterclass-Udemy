package classes;

public class Person {
	
	private String firstName, lastName;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setFirstName(String m) {
		firstName=m;
	}
	
	public void setLastName(String n) {
		lastName=n;
	}
	
	public void setAge(int k) {
		if(age<0 || age>100) {
			age=0;
		}
		age=k;
	}
	
	public boolean isTeen() {
		if(age>12 || age<20) {
			return true;	
		}
		return false;
	}
	
	public String getFullName() {
		String empty="";
		if(firstName.isEmpty() && lastName.isEmpty()) {
			return empty;
		}else if(!firstName.isEmpty() && lastName.isEmpty()) {
			return firstName;
		}else if(firstName.isEmpty() && !lastName.isEmpty()) {
			return lastName;
		}
		
		return(firstName +" " +lastName);
		
	}
	

}
