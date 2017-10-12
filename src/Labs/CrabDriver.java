package Labs;

public class CrabDriver {

	public static void main(String[] args) {
		
		Beach beach = new Beach();
		Crab MrKrabs = new Crab();
		
		
		MrKrabs.makeahole(MrKrabs.getMyname());
		MrKrabs.hangon(MrKrabs.getMyname(), MrKrabs.isHang());
		beach.Wave(MrKrabs.isHang(), false);
		beach.pinched(MrKrabs.pinchshell());
		
		MrKrabs.outofhole(MrKrabs.getMyname());
		beach.Wave(MrKrabs.isHang(), MrKrabs.isIsriding() );
		
		System.out.println("\n" + MrKrabs.toString() + "\n");
		System.out.println(beach.toString());
	}
	
	
}
