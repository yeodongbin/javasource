package transpotation;

public class Vehicle_example {
	public static void main(String[] args) {

		// Vehicle vehicle2 = new Vehicle();
		Vehicle vehicle = new Bus(); // �ڵ� ����ȯ
		vehicle.run(); // Vehicle ���� -> Bus ����
		// vehicle.checkFare();
		vehicle.electCharge();
		
		vehicle = new Taxi();
		vehicle.run();
		vehicle.electCharge();
		
		vehicle = new Airplain();
		vehicle.run();
		vehicle.electCharge();
		
		if (vehicle instanceof Bus) {
			System.out.println("���氡���մϴ�.");
			Bus bus = (Bus) vehicle;
			//bus.run();
			//bus.checkFare();
		}
	}
}
