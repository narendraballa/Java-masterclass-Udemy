package sec7co91;

public class Case {
	
	private String model;
	private String manufacturer;
	private String powersupply;
	private Dimensions dimensions;
	public Case(String model, String manufacturer, String powersupply, Dimensions dimensions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powersupply = powersupply;
		this.dimensions = dimensions;
	}
	
	public void presspowerbutton() {
		System.out.println("power button pressed");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowersupply() {
		return powersupply;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}
	
	 

	

	
	}
	
	


