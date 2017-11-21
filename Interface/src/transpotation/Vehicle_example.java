package transpotation;

public class Vehicle_example {
	public static void main(String[] args) {

		// Vehicle vehicle2 = new Vehicle();
		Vehicle vehicle = new Bus(); // 자동 형변환
		vehicle.run(); // Vehicle 선언 -> Bus 구현
		// vehicle.checkFare();
		vehicle.electCharge();
		
		vehicle = new Taxi();
		vehicle.run();
		vehicle.electCharge();
		
		vehicle = new Airplain();
		vehicle.run();
		vehicle.electCharge();
		
		if (vehicle instanceof Bus) {
			System.out.println("변경가능합니다.");
			Bus bus = (Bus) vehicle;
			//bus.run();
			//bus.checkFare();
		}
	}
}
