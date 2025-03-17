package helden;

import java.util.ArrayList;

public class Spieler {
private String name;
private int level;
private String[] tasche;
private ArrayList<String> rucksack;
private EKlassen klasse;
private ESpecies spezies;



public Spieler(String name, int level, String[] tasche, ArrayList<String> rucksack, EKlassen klasse, ESpecies spezies){
	this.name  = name.trim();
	this.level = level;
	this.tasche= tasche;
	this.rucksack = rucksack;
	this.klasse = klasse;
	this.spezies = spezies;
	
}
public Spieler(){
	this.name  = "";
	this.level = 0;
	this.tasche = new String[64];
	this.rucksack = new ArrayList<String>();
	
}

public String getName() {
	return this.name;
}

public int getLevel() {
	return this.level;
}

public String[] getTasche(){
	return this.tasche;
}

public ArrayList<String> getRucksack(){
	return this.rucksack;
}

public EKlassen getKlasse() {
	return klasse;
}

public ESpecies getSpezies() {
	return spezies;
}

public void setName(String firstName, String lastName) {
	name = firstName + " " + lastName;
	name = name.trim();	
}

public void setLevel(int level) {
	this.level = level;
}

public void setTasche(String[] tasche) {
	this.tasche = tasche;
}

public void setRucksack(ArrayList<String> rucksack) {
	this.rucksack = rucksack;
}

public void setKlasse(EKlassen klasse) {
	this.klasse=klasse;
}

public void setSpezies(ESpecies spezies) {
	this.spezies=spezies;
}

}
