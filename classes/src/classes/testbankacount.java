package classes;

public class testbankacount {

	public static void main(String[] args) {
	
		bankaccount priya=new bankaccount();
		priya.setbankNumber(12354);
		priya.setbalance(0.00);
        priya.setcustomername("priya");
        priya.setemail("myemail@priya.com");
		priya.setphonenumber("7731999111");
		
		priya.withdrawal(100.0);	
        priya.deposit(100);
        priya.withdrawal(45);
	}

}
