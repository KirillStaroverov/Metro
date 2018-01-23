import java.util.ArrayList;

public class Train {
	private int trainId;
	private int driverId;
	private int lineId;
	
	Driver driver;
	
	ArrayList<Wagon> wagon = new ArrayList<>(5);
	
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public int getLineId() {
		return lineId;
	}
	public void setLineId(int lineId) {
		this.lineId = lineId;
	}
	
	
}
