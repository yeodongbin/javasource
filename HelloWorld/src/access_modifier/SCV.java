package access_modifier;

public class SCV { //default
	int hp = 100; 
	int attack = 10;//default
	int defence = 5;
	
	SCV() {
		
	}
	
	public void attack() {
		System.out.println
		("�������Դϴ�.");
	}
	void defence() {
		System.out.println
		("������Դϴ�.");
	}
	
	int getHP() {
		return this.hp;	
	}
	
	void setHP(int hp) {
		this.hp = hp;
	}
}
