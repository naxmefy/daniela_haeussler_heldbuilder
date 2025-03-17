package helden;

public abstract class SkillTree {
	
	int level;
	String[] skill;
	String description; 
	boolean fullfilled;
	int useablePoints;
	EKlassen klasse;
	ESpecies species;
	
	public SkillTree(int level, String[]skill, String description, boolean fullfilled, int useablePoints) {
		this.level = level;
		this.skill = skill; 
		this.description = description;
		this.fullfilled = fullfilled; 
		this.useablePoints = useablePoints;
	}
}
