package string;

public class SmartPhone {
	private String company;
	private String os;         //필드

	public SmartPhone(String company, String os) {
		this.company = company;   // this.에 각각 저장
		this.os = os;
	}

	@Override
	public String toString() {
		return company + "," + os;  //toStiring() 재정의
	}
	}


