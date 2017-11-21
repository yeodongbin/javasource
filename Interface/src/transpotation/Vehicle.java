package transpotation;

public interface Vehicle {
	//필드 상수 [static final] 생략가능
	
	//추상 매서드[abtstract] 생략가능 
	public abstract void run();
	
	//Update
	default void electCharge() {
		System.out.println("충전중입니다.");
	}
}
