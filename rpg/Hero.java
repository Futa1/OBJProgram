package rpg;

public class Hero extends Character {
	int mp;
	
	public Hero(int hp, int mp, String name) {
		this.hp = hp;
		this.mp = mp;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
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
	
	// Monsterクラスのインスタンスで受け取ることで、
	// Monsterクラスを継承した各敵キャラに一貫した攻撃処理が実現できる
	public void attack(Monster m) {
		// Monster mに5ダメージ
		int m_hp = m.getHp();
		m.setHp(m_hp - 5);
		System.out.println(this.name + "の攻撃");
		System.out.println(m.getSpecies() + "に5ダメージ");
	}
	
	public String toString() {
		return "名前: " + this.name + ", HP: " + this.hp + ", MP: " + this.mp; 
	}
}
