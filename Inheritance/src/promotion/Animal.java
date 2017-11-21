package promotion;

public abstract class Animal {//추상 클래스
	//필드
	public String kind;
	
	//생성자
	Animal() {
		System.out.println("Animal()");
	}
	
	//매서드
	void breathe() {//일반 매서드
		System.out.println("Wild Breathe");
	}
	
	//public abstract void sound(); //추상매서드
}
