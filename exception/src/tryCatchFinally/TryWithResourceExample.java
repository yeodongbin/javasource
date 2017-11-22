package tryCatchFinally;

//import java.io.FileInputStream;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) { //���� ����� stream
			fis.read();
			throw new Exception(); //����ó�� �߻�
		} catch (Exception e) { //exception �޴´�.
			System.out.println("����ó�� �ǽ�");
		}
	}

}
