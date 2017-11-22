package tryCatchFinally;

//import java.io.FileInputStream;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) { //파일 입출력 stream
			fis.read();
			throw new Exception(); //예외처리 발생
		} catch (Exception e) { //exception 받는다.
			System.out.println("예외처리 실시");
		}
	}

}
