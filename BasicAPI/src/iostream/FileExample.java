package iostream;

import java.io.FileInputStream;

public class FileExample {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/test/test.txt");

			int data;
			while ( (data = fis.read() )!=-1) {
				System.out.print((char)data);
			}
			
			fis.close();
		} catch (Exception e) {
			System.out.println("파일을 열지 못했습니다.");
		}

	}
}
