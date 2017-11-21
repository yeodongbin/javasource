package airplain;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		// sa 인스턴스
		
		sa.takeOff();
		sa.land();
		sa.fly();
		sa.flyMode = 2;
		//sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
	}
}
