package throwsException;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �����");
		} catch(ClassNotFoundException e) {
			System.out.println("Class �� �����");
		}
		
	}
	
	public static void findClass() throws ClassNotFoundException
	{
		Class clazz = Class.forName("java.lang.String2");
	}

}
