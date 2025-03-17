package io.github.danielahaeussler.heldbuilder.helden;

public enum ESpecies {
  HUMAN("Mensch"),
  DWARF("Zwerg"),
  ELF("Elf"),
  ORK("Ork"),
  FAUN("Faun"),
  NYMPHE("Nymph");

  private String bezeichnung;

  /* boolscher Wert mit Werwolf - Identitätsmerkmal der Spezies
   * boolscher Wert mit Vampir? - Identitätsmerkmal einer Spezies
   * Monster: Aswang // */

  private ESpecies(String bezeichnung) {
    this.bezeichnung = bezeichnung;
  }

  public String getBezeichnung() {
    return this.bezeichnung;
  }
}
