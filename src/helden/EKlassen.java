package helden;

public enum EKlassen {
	
	KRIEGER("Krieger"), MAGIER("Magier"), PALADIN("Paladin"), WALDLÄUFER("Waldläufer"), BESCHWÖRER("Beschwörer"), BARDE("Barde"), HEILER("Heiler");
	
private String klassenName;


private EKlassen(String klasse) {
	this.klassenName= klasse;
}

public String getKlassenName() {
	return klassenName;
}
}

