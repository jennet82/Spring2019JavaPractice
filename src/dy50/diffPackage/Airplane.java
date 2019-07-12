package dy50.diffPackage;
import Day50.Vehicle;

public class Airplane extends Vehicle {
	
	//protected int year;
	private int wingCount;
	
	// public Airplane(){
	//super();
	
	public Airplane (String brand, String model, int year, int wingCopunt) {
	
	super(brand,model,year);
	this.wingCount =wingCount;
	
}

	public int getWingCount() {
		return wingCount;
	}

	public void setWingCount(int wingCount) {
		this.wingCount = wingCount;
	}

	@Override
	public String toString() {
		return "Airplane [wingCount=" + wingCount + 
				", year=" + year + ", "
						+ ", getBrand()=" + getBrand()
						+ ", getModel()=" 
						+ getModel() + "]";
	}
	
	
}
