package mobility;

public class Bike{
	private String id_Bike;
	private Boolean Dispo;


public Bike(String id_Bike, Boolean Dispo){
	this.id_Bike = id_Bike;
	this.Dispo = Dispo;
};

public String getId() {
	return this.id_Bike;
};

public Boolean isAvailable() {
	return this.Dispo;
};

}