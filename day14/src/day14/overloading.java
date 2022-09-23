package day14;

public class overloading {
	
	public static void main(String [] args) {
		calcfeetandinchestocentimeters(6,0);
		calcfeetandinchestocentimeters(7,5);
		calcfeetandinchestocentimeters(-5,3);
		calcfeetandinchestocentimeters(100);
	}
	public static double calcfeetandinchestocentimeters(double feet,double inches) {   
		//1 inch=2.54cm
		//1 foot=12 inches
		// USING DOUBLE BECAUSE WE GET ANS CENTIMETERS IN DECIMALS
		
		 if((feet<0) && (inches>0)||(inches>12)) {
			 System.out.println("invalid value");
			 return -1;
		 }
		double centimeters=(feet*12)*2.54;
		centimeters+=inches*2.54;
		System.out.println(feet +"feet +" + inches +"inches="+ centimeters+ "cm");
		return centimeters;		
	}
	public static double calcfeetandinchestocentimeters(double inches) {
		if(inches<0) {
			return -1;
		}
		double feet=(int)inches/12;
		double remaininginches=(int) inches%12;
		System.out.println(inches +"inches is equal to " +feet +"feet and"+ remaininginches+"inches");
		return calcfeetandinchestocentimeters(feet,remaininginches);
	}
	
}
