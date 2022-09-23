package classes;

public class bankaccount {
	
	private int bankNumber;
	private double balance;
	private String customername;
	private String email;
	private String phonenumber;
	
	public bankaccount() {
		System.out.println("Empty constructor called");                 //creating constructor
	}
	
	public bankaccount(int bankNumber,double balance,String customername,String email,String phonenumber) {
		 this.bankNumber=bankNumber;
		 this.balance=balance;
		 this.customername=customername;
		 this.email=email;
		 this.phonenumber=phonenumber; 
	}
	
	public void deposit(double depositamount) {
		this.balance+=depositamount;
		System.out.println("depositamount is " +depositamount + "and Remaining balance is " + this.balance);
	}
	
	
	public void withdrawal(double withdrawalamount) {
		if(this.balance-withdrawalamount<0) {
			System.out.println("Only " +balance + "is allowed " + "withdraw not processed");
		}else {
	    
		this.balance-=withdrawalamount;	
		System.out.println("Withdrawal amount is " +withdrawalamount  +  "and remaining balance is " +this.balance );
		}
}
	 
	
	public int getbankNumber() {
		return bankNumber;
	}
	
	public double getbalance() {
		return balance;
	}	
	
	public String getcustomername() {
		return customername;
	}
	
	public String getemail() {
		return email;
	}

	public String getphonenumber() {
		return phonenumber;
	}
	
	public void setbankNumber(int m) {
		this.bankNumber=bankNumber;
	}
	
	public void setbalance(double balance) {
		this.balance=balance;
	}
	public void setcustomername(String customername) {
		this.customername=customername;
	}

	public void setemail(String email) {
		this.email=email;
	}
	
	public void setphonenumber(String phonenumber) {
		this.phonenumber=phonenumber;
	}
	
	
	
	
	
	
	
	
}
