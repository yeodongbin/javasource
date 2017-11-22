package tryCatchFinally;

public class TryCatchNullPointerException {

	public static void main(String[] args) {
		try {
			//ArrayIndexOutOfBounds
			String data1 = args[0];
			String data2 = args[1];

			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
			
			//NullPointerException
			String data = null;
			System.out.println(data.toString());
			
		} catch (Exception e) {
			System.out.println("Exception ¹ß»ý");
		} 
	}

}
