
public class Printer {

	private int tonerLevel;
	private int pagesPrinted;
	public boolean duplexprinter;
	
	public Printer(int tonerLevel, boolean duplexprinter) { 
		this.tonerLevel = tonerLevel;
		if(tonerLevel>-1 && tonerLevel<=100) {
			this.tonerLevel=tonerLevel;
		}else {
			this.tonerLevel=-1;
		}
		
		this.pagesPrinted = 0;
		this.duplexprinter = duplexprinter;
	}
	
	public int addToner(int tonerAmount) {
		if(tonerLevel>-1 && tonerLevel<=100) {
			if(this.tonerLevel+tonerAmount>100) {
				return -1;
			}
			this.tonerLevel+=tonerAmount;
			return this.tonerLevel;
		}else {
			return -1;
		}
	}
	
	public int printpages(int pages) {
		int pagestoprint=pages;
		if(this.duplexprinter) {
			 pagestoprint/=2;
			 System.out.println("Printing in duplex mode");
		}
		this.pagesPrinted+=pagestoprint;
		return pagestoprint;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
	 
	
}
