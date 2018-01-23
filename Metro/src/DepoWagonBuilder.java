
public class DepoWagonBuilder extends Depo{
	private int wagonId; 
	private boolean isHeadWagon = false;
	
	public DepoWagonBuilder(int wagonId, boolean isHeadWagon) {
		this.wagonId = wagonId;
		this.isHeadWagon = isHeadWagon;
	}
	
	public Wagon build() {
		return new Wagon(this);
	}

	public int getWagonId() {
		return wagonId;
	}

	public boolean getIsHeadWagon() {
		return isHeadWagon;
	}
	
}
