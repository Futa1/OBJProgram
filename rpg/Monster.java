package rpg;

public abstract class Monster implements Creature {
	int hp;
	int mp;
	String species;
	
	public abstract void setHp(int hp);
	public abstract int getHp();
	
	public abstract void setMp(int mp);
	public abstract int getMp();
	
	public abstract String getSpecies();
	
	public abstract void attack(Character c);
	public abstract void run();
}
