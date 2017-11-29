package gyeo;

public class MyRound {

	static double myround(double a, int b) {
		double powValue = Math.pow(10, b);
		return Math.round(a * powValue) / powValue;
	}

	public static void main(String[] args) {

		double value1 = 1234.56;
		
		System.out.println("a= " + myround(value1, 1));
		
		/*
		double value2 = 1234.6;
		double temp3 = value2 * 10;
		long temp4 = Math.round(value2) * 100;
		double a2 = temp4 / 100.0;

		System.out.println("a2=" + a2);

		
		 * double value2 = 1234.56; //double temp3 = value2 * 10; long temp4 =
		 * Math.round(value2) * 100; double a2 = temp4 / 100.0; System.out.println("a2="
		 * + a2);
		 */
	}
}
