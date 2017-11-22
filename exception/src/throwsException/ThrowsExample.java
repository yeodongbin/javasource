package throwsException;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열이 없어요");
		} catch(ClassNotFoundException e) {
			System.out.println("Class 가 없어요");
		}
		
	}
	
	public static void findClass() throws ClassNotFoundException
	{
		Class clazz = Class.forName("java.lang.String2");
	}

}
