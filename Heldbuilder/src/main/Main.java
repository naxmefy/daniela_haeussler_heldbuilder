package main;

import java.util.ArrayList;
import helden.EKlassen;
import helden.ESpecies;
import helden.Spieler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spieler spieler1 = new Spieler("Manuel Müller",9,new String[]{"Auto","Pistole","Taschenlampe"},new ArrayList<String>(), EKlassen.KRIEGER, ESpecies.ORK);
		Spieler spieler2= new Spieler("Thomas Neuer",0,new String[64],new ArrayList<String>(), EKlassen.HEILER, ESpecies.NYMPHE);

		spieler1.getRucksack().add("Ring");
		spieler1.getRucksack().add("Kurzschwert");
		spieler2.getRucksack().add("Schwert");
		spieler2.getRucksack().add("Gesangsbuch");

		System.out.println(spieler1.getName() + " ist Level " + spieler1.getLevel() + " und spielt einen " + spieler1.getKlasse().getKlassenName() + " und gehört zur Spezies: "+ spieler1.getSpezies().getBezeichnung());
		System.out.println(spieler2.getName() + " ist Level " + spieler2.getLevel() + " und spielt eine " + spieler2.getKlasse().getKlassenName() + "in und gehört zur Spezies: " + spieler2.getSpezies().getBezeichnung());
	}

}
