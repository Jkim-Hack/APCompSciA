package Labs;

public class BandBooster {

	private String name;
	private int boxesSold;
	
	public BandBooster(String nam) {
		
		name = nam;
		boxesSold = 0;
		
	}

	public String getName() {
		return name;
	}

	public void updateSales(int box) {
		
		boxesSold += box;
		
	}

	
	public String toString() {
		return name + ": " + boxesSold + " boxes";
	}
	
	
	
	
	
	
}
