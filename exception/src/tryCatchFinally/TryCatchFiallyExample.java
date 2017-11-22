package tryCatchFinally;

public class TryCatchFiallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("No class");//Ãâ·Â
		} finally {
			System.out.println("finally");
		}
	}

}
