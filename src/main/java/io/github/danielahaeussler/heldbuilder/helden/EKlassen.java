package io.github.danielahaeussler.heldbuilder.helden;

public enum EKlassen {
  KRIEGER("Krieger"),
  MAGIER("Magier"),
  PALADIN("Paladin"),
  WALDLAEUFER("Waldläufer"),
  BESCHWOERER("Beschwörer"),
  BARDE("Barde"),
  HEILER("Heiler");

  private String klassenName;

  private EKlassen(String klasse) {
    this.klassenName = klasse;
  }

  public String getKlassenName() {
    return klassenName;
  }
}
