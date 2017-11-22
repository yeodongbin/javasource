package runtime_exception;

public class NumberFormatException {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "200";//exception
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(value1 + " + " + value2 + " = " +result);
	}

}
