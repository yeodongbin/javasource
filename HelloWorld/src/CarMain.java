
public class CarMain {
	public static void main(String[] args) {
		Car bmw5 = 
				new Car("Blue"); // �ν��Ͻ� bmw5
		Car bmwF = 
				new Car("Red", 300); // ������
		Car mybmw = 
				new Car(300);
		int re;
		
		mybmw.start();
		mybmw.start("�޷�");
		re = mybmw.add(20.2, 30.3);
		re = mybmw.add(20, 30, 40);
		System.out.println(re);
		/*
		 * System.out.println(bmw5.company); System.out.println(bmw5.model);
		 * System.out.println(bmw5.maxSpeed);
		 * 
		 * System.out.println(bmw5.currSpeed); bmw5.currSpeed = 100;
		 * System.out.println(bmw5.currSpeed);
		 System.out.println(" ���� :" + bmw5.color);
		System.out.println(" ���� :" + bmw5.maxSpeed);
		System.out.println("ģ���� : " + bmwF.color);
		System.out.println("ģ���� : " + bmwF.maxSpeed);
		 */

		
	}
}
