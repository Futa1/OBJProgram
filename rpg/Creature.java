package rpg;

// Interfaceを実装することで、
// 少なくともinterfaceに実装されたメソッドは実装クラスが保有していることを保証できる
// Javaではinterfaceの多重継承が許される
public interface Creature {
	// 逃げるぐらいはするだろう
	public abstract void run();
}
