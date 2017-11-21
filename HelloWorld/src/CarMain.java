
public class CarMain {
	public static void main(String[] args) {
		Car bmw5 = 
				new Car("Blue"); // 인스턴스 bmw5
		Car bmwF = 
				new Car("Red", 300); // 생성자
		Car mybmw = 
				new Car(300);
		int re;
		
		mybmw.start();
		mybmw.start("달려");
		re = mybmw.add(20.2, 30.3);
		re = mybmw.add(20, 30, 40);
		System.out.println(re);
		/*
		 * System.out.println(bmw5.company); System.out.println(bmw5.model);
		 * System.out.println(bmw5.maxSpeed);
		 * 
		 * System.out.println(bmw5.currSpeed); bmw5.currSpeed = 100;
		 * System.out.println(bmw5.currSpeed);
		 System.out.println(" 내차 :" + bmw5.color);
		System.out.println(" 내차 :" + bmw5.maxSpeed);
		System.out.println("친구차 : " + bmwF.color);
		System.out.println("친구차 : " + bmwF.maxSpeed);
		 */

		
	}
}
