package promotion;

public class Parent {
	public void method1(Parent parent) {
		if (parent instanceof Child) {
			System.out.println
			("parent가 Child로 강제 형변환 가능");
		} else {
			System.out.println
			("parent가 Child로 변환 불가 X");
		}
	}
	
	public void method2(Parent parent) {
		if (parent instanceof Parent) {
			System.out.println
			("parent가 Parent로 강제 형변환 가능");	
		} else {
			System.out.println
			("parent가 Parent로 변환 불가 X");
		}
		
	}
}
