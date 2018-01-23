
public class Wagon {
	private int wagonId; 
	private boolean isHeadWagon;
	
	private int trainId; 
	
	public Wagon(DepoWagonBuilder depo) {
		this.wagonId = depo.getWagonId();
		this.isHeadWagon = depo.getIsHeadWagon();
	}
	
	
}
