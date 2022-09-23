package classes;

public class Testmain {
	
	public static void main(String [] args) {
		
		SimpleCalculator calculator=new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setsecondNumber(4);
        System.out.println("add is " + calculator.getAdditionResult() );	
        System.out.println("subtract is " + calculator.getSubtractionResult() );	  
        calculator.setFirstNumber(5.25);
        calculator.setsecondNumber(0);
        System.out.println("Multiply is " + calculator.getMultiplicationResult() );	
        System.out.println("Divide is " + calculator.getDivisionResult() );	
  	}

}
