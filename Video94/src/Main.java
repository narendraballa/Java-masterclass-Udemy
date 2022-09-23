
public class Main {
public static void main(String [] args) {
	

	Printer printer=new Printer(50,true);  	
	System.out.println("Initial page count=" +printer.getPagesPrinted());
    int pagesprinted=printer.printpages(4);
    System.out.println("pages printed was "+pagesprinted +"new total print count for printer =" +printer.getPagesPrinted());
    pagesprinted=printer.printpages(2);
    System.out.println("pages printed was "+pagesprinted +"new total print count for printer =" +printer.getPagesPrinted());
   }
}
