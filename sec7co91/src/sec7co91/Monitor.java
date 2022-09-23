package sec7co91;

public class Monitor {
	
	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution;
	
		public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawpixelat(int x,int y,String colour) {
		System.out.println("Drwaing pixel at" +x +"," + y + "in colour" + colour);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}

}
