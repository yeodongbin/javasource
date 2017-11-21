package inheritance;

public class Main {

	public static void main(String[] args) {
		
//		
//		System.out.println(mSeris.tire);
//		System.out.println(mSeris.airbag);
//		System.out.println(mSeris.maxSpeed);
//		System.out.println("horse :" + mSeris.horse);
//		
		Macha macha = new Macha();
		Macha macha1 = new Macha();
		Macha macha2 = new Macha();
		macha.run();
		Car car = new Car();
		car.run();
		SportsCar mSeris = new SportsCar();
		mSeris.run();

	}

}
