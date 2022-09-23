package classes;

public class SimpleCalculator {
	
	private double firstNumber,secondNumber;
	
	public double getFirstNumber() {
		return firstNumber;
	}
	
	public double getsecondNumber() {
		return secondNumber;
	}
	
	public void setFirstNumber(double m) {
		firstNumber=m;
	}
	
	public void setsecondNumber(double n) {
		secondNumber=n;
	}
	
	public double getAdditionResult() {
		return (firstNumber+secondNumber);
	}
	
	public double getSubtractionResult() {
		return (firstNumber-secondNumber);
	}
	
	public double getMultiplicationResult() {
		return (firstNumber*secondNumber);
	}
	
	public double getDivisionResult() {
            if(secondNumber==0) {
            	return 0;
            }
	return (firstNumber/secondNumber);
	
	}
	
	

}
