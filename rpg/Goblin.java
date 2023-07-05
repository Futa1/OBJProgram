package rpg;

public class Goblin extends Monster {
	int hp = 100;
	int mp = 10;
	String species = "Goblin";
	
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
	
	// attackは抽象メソッドなので、継承が強制される(Goblinはnewしてインスタンス化するつもりなため)
	public void attack(Character c) {
		System.out.println("ゴブリンの攻撃");
		int c_hp = c.getHp();
		c.setHp(c_hp - 5);
		System.out.println(c.getName() + "に5ダメージ");
	}
	
	public void run() {
		System.out.println("ゴブリンは逃げ出した");
	}
	
	public String toString() {
		return "Goblin" + ", HP:" + this.hp + ", MP: " + this.mp;
	}
}
