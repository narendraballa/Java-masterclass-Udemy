package classes;

public class testvipcustomer {
	
	public static void main(String [] args) {
		
		vipcustomer person1=new vipcustomer();
		System.out.println(person1.getname());
		
		vipcustomer person2=new vipcustomer("Bob",25000.00);
		System.out.println(person2.getname());
		
		vipcustomer person3=new vipcustomer("Tim",100.00,"tim@email.com");
		System.out.println(person3.getname());
		System.out.println(person3.getemail());
	}

}
