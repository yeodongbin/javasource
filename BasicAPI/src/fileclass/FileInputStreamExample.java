package fileclass;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("c:/test/test1.txt")) 
		{
			int data;
			while ((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
			//fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
