package promotion;

public class Parent {
	public void method1(Parent parent) {
		if (parent instanceof Child) {
			System.out.println
			("parent�� Child�� ���� ����ȯ ����");
		} else {
			System.out.println
			("parent�� Child�� ��ȯ �Ұ� X");
		}
	}
	
	public void method2(Parent parent) {
		if (parent instanceof Parent) {
			System.out.println
			("parent�� Parent�� ���� ����ȯ ����");	
		} else {
			System.out.println
			("parent�� Parent�� ��ȯ �Ұ� X");
		}
		
	}
}
