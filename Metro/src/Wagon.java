
public class Wagon {
	private int wagonId; 
	private int trainId; 
	private String wagonType;
	
	public Wagon(Depo depo) {
		this.wagonId = depo.getWagonId();
		this.wagonType = depo.getWagonType();
	}
	
	
}
