package class_example;

public class Car {
//field �ʵ�
	static final String company = 
			"BMW";
	static final double PI = 3.14521;
	String model;
	int cc;
	int maxSpeed;
	int speed;
	
//Constructor ������ �����ε�
	Car(int cc) {
		this(cc, "���������");
		/*
		String model = "���";
		System.out.println(model);*/
	}
	
	Car(String model) {
		this(5000, model);
	}
	
	Car(int cc, String model){
		this.cc = cc;
		this.model = model;
		System.out.println("Car(int cc, String model) ȣ��");
	}
	
	Car( int cc, String model, int maxSpeed) {
		this(cc, model);
		/*this.cc = cc;
		this.model = model;*/
		this.maxSpeed = maxSpeed;
	}

	//Method �ż���
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i=10; i<=50; i+=10 ) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�."
					+ this.speed + "km/h");
		}
	}
}
