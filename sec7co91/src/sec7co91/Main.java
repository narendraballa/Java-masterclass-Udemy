package sec7co91;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Dimensions dimensions=new Dimensions(20,20,5);
		Case theCase=new Case("220B","dell","240",dimensions);
		Monitor theMonitor=new Monitor("27 inch beast","Acer",27,new Resolution(2540,1440));
		
		Motherboard theMotherboard= new Motherboard("BJ-200","Asus",4,6,"v2.44");
		PC thePC=new PC(theCase,theMonitor,theMotherboard);
		thePC.getMonitor().drawpixelat(1500,1200,"red");
		thePC.getMotherboard().loadprogram("windows 1.0");
		thePC.getTheCase().presspowerbutton();
	}

}
