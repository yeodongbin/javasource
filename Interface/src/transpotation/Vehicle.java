package transpotation;

public interface Vehicle {
	//�ʵ� ��� [static final] ��������
	
	//�߻� �ż���[abtstract] �������� 
	public abstract void run();
	
	//Update
	default void electCharge() {
		System.out.println("�������Դϴ�.");
	}
}
