package string;

public class SmartPhone {
	private String company;
	private String os;         //�ʵ�

	public SmartPhone(String company, String os) {
		this.company = company;   // this.�� ���� ����
		this.os = os;
	}

	@Override
	public String toString() {
		return company + "," + os;  //toStiring() ������
	}
	}


