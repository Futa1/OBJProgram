package rpg;

public class Slime extends Monster {
	int hp = 50;
	int mp = 5;
	String species = "Slime";
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHp() {
		return this.hp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getMp() {
		return this.mp;
	}
	
	public String getSpecies() {
		return this.species;
	}
	
	public void attack(Character c) {
		System.out.println("スライムの攻撃");
		int c_hp = c.getHp();
		c.setHp(c_hp - 1);
		System.out.println(c.getName() + "に1ダメージ");
	}
	
	public void run() {
		System.out.println("スライムはのろのろと逃げ出した");
	}
	
	public String toString() {
		return "Slime" + ", HP:" + this.hp + ", MP: " + this.mp;
	}
}
