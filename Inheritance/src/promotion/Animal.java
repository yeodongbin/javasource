package promotion;

public abstract class Animal {//�߻� Ŭ����
	//�ʵ�
	public String kind;
	
	//������
	Animal() {
		System.out.println("Animal()");
	}
	
	//�ż���
	void breathe() {//�Ϲ� �ż���
		System.out.println("Wild Breathe");
	}
	
	//public abstract void sound(); //�߻�ż���
}
