import java.util.ArrayList;

public class Depo {
	
	ArrayList<Wagon> allWagons = new ArrayList<Wagon>();
	ArrayList<Train> allTrains = new ArrayList<>();
	
	public Wagon getNextWagon(int i) {
		return allWagons.get(i);
	}
}
