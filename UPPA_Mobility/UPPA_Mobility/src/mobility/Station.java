package mobility;

import java.util.ArrayList;
import java.util.List;

public class Station{
	private String NomStation;
	private int CapaciteMax;
	private List<Bike> bikes;


	public Station(String NomStation, int CapaciteMax){
		this.NomStation = NomStation;
		this.CapaciteMax = CapaciteMax;
		this.bikes = new ArrayList<>();
	};

	public String getName() {
		return this.NomStation;
	};

	public int getCapacity() {
		return this.CapaciteMax;
	};
	
	public boolean isFull(){
		return this.bikes.size() >= this.CapaciteMax;
	}
	
	public void addBike(Bike bike) {
		if(bike == null) {
			throw new IllegalArgumentException("Le vélo ne peut être nul");
		}
		if(this.isFull()){
			throw new IllegalStateException("Station is full");	
		}
		this.bikes.add(bike);
	}
	public void removeBike(Bike bike) {
		this.bikes.remove(bike);
	}
	public boolean containtsBike(Bike bike) {
		return this.bikes.contains(bike);
	}
}