package rpg;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 敵キャラクターのインスタンス化
		Monster goblin = new Goblin();
		Monster slime = new Slime();
		// 敵キャラをリストに保持
		List<Monster> enemy_list = new ArrayList<>();
		enemy_list.add(goblin);
		enemy_list.add(slime);
		
		// 勇者パーティをインスタンス化
		Character hero = new Hero(500, 200, "Taro");
		Character wizard = new Wizard(200, 400, "Keiko");
		// 勇者パーティをリストに保持
		List<Character> party_list = new ArrayList<>();
		party_list.add(hero);
		party_list.add(wizard);
		
		// 戦闘前の状態を表示
		// 敵キャラ
		for (Monster m : enemy_list) {
			System.out.println(m);
		}
		// 勇者パーティ
		for (Character c : party_list) {
			System.out.println(c);
		}
		
		// 戦闘開始
		for (Character c : party_list) {
			for (Monster m : enemy_list) {
				c.attack(m);
				m.attack(c);
			}
		}
		
		// wizardをCharacter型で捉えているため
		// healが呼べない
		if (wizard instanceof Wizard) {
			// tmp_wizardのscopeはif文の中のみ
			Wizard tmp_wizard = (Wizard) wizard;
			tmp_wizard.heal(hero);
		}
		
		for (Monster m : enemy_list) {
			m.run();
		}
		
		// 戦闘終了後の状態を表示
		for (Monster m : enemy_list) {
			System.out.println(m);
		}
		for (Character c : party_list) {
			System.out.println(c);
		}
	}
	
	
}
