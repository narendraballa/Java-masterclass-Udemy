package sec7co91;

public class Motherboard {
	
	private String model;
	private String manufacturer;
	private int ramslots;
	private int cardslots;
	private String bios;
	 
	public Motherboard(String model, String manufacturer, int ramslots, int cardslots, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramslots = ramslots;
		this.cardslots = cardslots;
        this.bios = bios;
	
	 
	}
	  
	public void loadprogram(String programname) {
	 
		System.out.println("program  is " +programname + "is noew loading..");
	}
	
	
	

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getRamslots() {
		return ramslots;
	}

	public int getCardslots() {
		return cardslots;
	}

	public String getBios() {
		return bios;
	}
	
	

}
