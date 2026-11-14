package mobility;

public class User{
	private String id_User;
	private String NomUser;


public User(String id_User, String NomUser){
	this.id_User = id_User;
	this.NomUser = NomUser;
};

public String getId() {
	return this.id_User;
};

public String getName() {
	return this.NomUser;
};

}