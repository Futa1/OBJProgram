package rpg;

// abstract classはnewで実体化できない
// abstractメソッドがある内は、自動的にabstract classになる
// abstract methodのoverrideを強制できる
public abstract class Character implements Creature {
	String name;
	int hp;
	
	public abstract void setName(String name);
	public abstract String getName();
	
	public abstract void setHp(int hp);
	public abstract int getHp();
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	// 名前が与えられるくらいまで具体的なゲームキャラならば、
	// 攻撃処理も持っているはずだが、
	// 具体的なキャラクターにならないと
	// 攻撃力や攻撃手段など決められない
	// abstractで抽象メソッドであることを明示
	public abstract void attack(Monster m);
}
