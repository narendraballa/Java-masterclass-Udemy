package classes;

public class outlander extends Car {
 
    private int roadServicemonths;

	public outlander(int roadServicemonths) {
		super("outlander", "4WD", 5, 5, 6,false);
		this.roadServicemonths = roadServicemonths;
	}	
	
	public void acclerate(int rate) {
		
		int newvelocity = getcurrentvelocity()+ rate;
        if(newvelocity==0) {
        	stop(); 
        	changegear(1);
        }else if (newvelocity>0 && newvelocity<=10) {
        	changegear(1);
        }else if (newvelocity>10 && newvelocity<=20) {
        	changegear(2);
        }else if (newvelocity>20 && newvelocity<=30) {
            	changegear(3);
        }else if (newvelocity>30 && newvelocity<=40) {
        	changegear(4);
        }
         
        if(newvelocity>0) {
        	changevelocity(newvelocity,getcurrentdirection());
        }
	
	}   	
    
	 
}
