
public class Depo {
	private int wagonId; 
	private String wagonType = "average";
	
	public Depo(int wagonId, String wagonType) {
		this.wagonId = wagonId;
		this.wagonType = wagonType;
	}
	
	public Wagon build() {
		return new Wagon(this);
	}

	public int getWagonId() {
		return wagonId;
	}

	public String getWagonType() {
		return wagonType;
	}
	
}
