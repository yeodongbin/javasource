package runtime_exception;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {

		/*
		 * String[] data; String data1 = data[0]; String data2 = data[1];
		 */
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];

			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} else {
			System.out.println("매개변수의 갯수가 2개가 아닙니다.");
			System.out.println("매개변수의 갯수가 2개가 아닙니다.");
		}
	}

}
