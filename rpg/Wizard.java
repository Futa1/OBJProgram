package rpg;

public class Wizard extends Character {
	int mp;
	
	public Wizard(int hp, int mp, String name) {
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
	
	public void attack(Monster m) {
		// Monsterに魔法攻撃
		int m_hp = m.getHp();
		m.setHp(m_hp - 10);
		System.out.println(this.name + "の魔法攻撃");
		System.out.println(m.getSpecies() + "に10ダメージ");
	}
	
	// Character型で受けることで、
	// 個別のキャラクターに関わらず、処理できる
	public void heal(Character c) {
		// Character型のインスタンスを回復
		if (this.mp >= 5) {
			int c_hp = c.getHp();
			c.setHp(c_hp + 5);
			System.out.println(this.name + "は回復魔法を使った");
			System.out.println(c.getName() + "を5回復");
			this.mp -= 5;
			System.out.println(this.name + "はMPを5消費した");
		}
	}
	
	public String toString() {
		return "名前: " + this.name + ", HP: " + this.hp + ", MP: " + this.mp; 
	}
}
